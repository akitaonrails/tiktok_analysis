package X;

import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864930XwR extends AbstractC867440Y1e<C869590Y9l> {
    public boolean LJ;
    public long LJFF;
    public int LJI;
    public int LJII;
    public RequestBody LJIIIIZZ;

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        return true;
    }

    public final void LJIIZILJ() {
        RequestBody requestBody = this.LJIIIIZZ;
        if (requestBody == null) {
            return;
        }
        if (this.LJ) {
            DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody = requestBody.delete_stranger_message_body;
            if (deleteStrangerMessageRequestBody == null || deleteStrangerMessageRequestBody.server_message_id == null) {
                return;
            }
            C0Y2S c0y2sLJIIIIZZ = this.LIZJ.LJIIZILJ().getMessage().LJIIIIZZ();
            int i = this.LJII;
            Long l = deleteStrangerMessageRequestBody.server_message_id;
            InterfaceC864940XwS interfaceC864940XwS = c0y2sLJIIIIZZ.LIZIZ;
            if (interfaceC864940XwS != null) {
                interfaceC864940XwS.LIZLLL(i, l, deleteStrangerMessageRequestBody);
                return;
            }
            return;
        }
        DeleteMessageRequestBody deleteMessageRequestBody = requestBody.delete_message_body;
        if (deleteMessageRequestBody == null || deleteMessageRequestBody.message_id == null) {
            return;
        }
        C0Y2S c0y2sLJIIIIZZ2 = this.LIZJ.LJIIZILJ().getMessage().LJIIIIZZ();
        int i2 = this.LJII;
        Long l2 = deleteMessageRequestBody.message_id;
        InterfaceC864940XwS interfaceC864940XwS2 = c0y2sLJIIIIZZ2.LIZIZ;
        if (interfaceC864940XwS2 != null) {
            interfaceC864940XwS2.LIZJ(i2, l2, deleteMessageRequestBody);
        }
    }

    public C864930XwR(C0YEM c0yem) {
        this(c0yem, null, false);
    }

    public final C0Y8T LJIILIIL(String str) {
        C0Y8T c0y8tLIZ = this.LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null) {
            return this.LIZJ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true);
        }
        return c0y8tLIZ;
    }

    public final void LJIILJJIL(C0Y8T c0y8t) {
        if (c0y8t == null) {
            return;
        }
        if (c0y8t.isStranger() && c0y8t.getLastShowMessage() == null) {
            this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJIL(c0y8t);
        } else {
            this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, c0y8t);
        }
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
        if (c0yin.LJIIJJI()) {
            if (this.LJ) {
                DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody = this.LJIIIIZZ.delete_stranger_message_body;
                if (deleteStrangerMessageRequestBody != null && deleteStrangerMessageRequestBody.server_message_id != null) {
                    C0Y2S c0y2sLJIIIIZZ = this.LIZJ.LJIIZILJ().getMessage().LJIIIIZZ();
                    Long l = deleteStrangerMessageRequestBody.server_message_id;
                    InterfaceC864940XwS interfaceC864940XwS = c0y2sLJIIIIZZ.LIZIZ;
                    if (interfaceC864940XwS != null) {
                        interfaceC864940XwS.LIZIZ(l.longValue());
                        return;
                    }
                    return;
                }
                return;
            }
            DeleteMessageRequestBody deleteMessageRequestBody = this.LJIIIIZZ.delete_message_body;
            if (deleteMessageRequestBody == null || deleteMessageRequestBody.message_id == null) {
                return;
            }
            C0Y2S c0y2sLJIIIIZZ2 = this.LIZJ.LJIIZILJ().getMessage().LJIIIIZZ();
            Long l2 = deleteMessageRequestBody.message_id;
            InterfaceC864940XwS interfaceC864940XwS2 = c0y2sLJIIIIZZ2.LIZIZ;
            if (interfaceC864940XwS2 == null) {
                return;
            }
            interfaceC864940XwS2.LIZIZ(l2.longValue());
            return;
        }
        LJIIZILJ();
    }

    public final void LJIILL(C869590Y9l c869590Y9l, C0YUT c0yut) {
        if (c869590Y9l != null && c869590Y9l.getMsgId() > 0) {
            C0YEM c0yem = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ref_");
            sbLIZ.append(c869590Y9l.getMsgId());
            C867650Y1z.LIZIZ(c0yem, C2188811AlT.LIZIZ(sbLIZ), c0yut);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C864930XwR(C0YEM c0yem, InterfaceC863600XuI interfaceC863600XuI, boolean z) {
        C0YMR c0ymr;
        if (z) {
            c0ymr = C0YMR.DELETE_STRANGER_MESSAGE;
        } else {
            c0ymr = C0YMR.DELETE_MESSAGE;
        }
        super(c0yem, c0ymr.getValue(), interfaceC863600XuI);
        this.LJ = z;
    }

    public final void LJIIJJI(final long j, final String str, final String str2) {
        this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0Xvl
            @Override // X.InterfaceC872410YKh
            public final Void LIZ() throws Throwable {
                C0Y8T c0y8tLJIILIIL;
                C869590Y9l c869590Y9lLJJJI = this.LIZLLL.LIZLLL.LJI().LJJJI(str);
                if (c869590Y9lLJJJI == null) {
                    return null;
                }
                if (c869590Y9lLJJJI.getDeleted() != 1) {
                    C868780Y6i c868780Y6iLIZLLL = this.LIZLLL.LIZJ.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("commitDelete: undo happened, skipping ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c868780Y6iLIZLLL.getClass();
                    C868780Y6i.LJ(c868780Y6iLIZLLL, "DeleteMsgHandler", strLIZIZ, 4);
                    return null;
                }
                String strLJFF = this.LIZLLL.LIZLLL.LIZJ().LJFF(str, "local_delete_time");
                if (strLJFF == null) {
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZLLL.LIZJ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("commitDelete: no stored delete time, skipping ");
                    sbLIZ2.append(str);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c868780Y6iLIZLLL2.getClass();
                    C868780Y6i.LJ(c868780Y6iLIZLLL2, "DeleteMsgHandler", strLIZIZ2, 4);
                    return null;
                }
                try {
                    if (CastLongProtector.parseLong(strLJFF) != j) {
                        C868780Y6i c868780Y6iLIZLLL3 = this.LIZLLL.LIZJ.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("commitDelete: delete time changed (undo+re-delete), skipping ");
                        sbLIZ3.append(str);
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                        c868780Y6iLIZLLL3.getClass();
                        C868780Y6i.LJ(c868780Y6iLIZLLL3, "DeleteMsgHandler", strLIZIZ3, 4);
                        return null;
                    }
                    boolean zEquals = "1".equals(this.LIZLLL.LIZLLL.LIZJ().LJFF(str, "local_delete_is_local"));
                    this.LIZLLL.LIZLLL.LJI().LJIIZILJ(str);
                    this.LIZLLL.LIZLLL.LIZJ().LLJJIJI(str, "local_delete_time");
                    this.LIZLLL.LIZLLL.LIZJ().LLJJIJI(str, "local_delete_is_local");
                    if (c869590Y9lLJJJI.getMsgId() <= 0 || zEquals || (c0y8tLJIILIIL = this.LIZLLL.LJIILIIL(str2)) == null) {
                        return null;
                    }
                    this.LIZLLL.LJIIL(c0y8tLJIILIIL.getInboxType(), c869590Y9lLJJJI.getConversationShortId(), c869590Y9lLJJJI.getMsgId(), c869590Y9lLJJJI.getConversationType(), str2);
                    return null;
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        }, null, false, this.LIZJ.LJIIL().LIZLLL());
    }

    public final C0Y8T LJIILLIIL(C869590Y9l c869590Y9l, String str, String str2) throws Throwable {
        boolean z;
        C0Y8T c0y8tLJIILIIL = LJIILIIL(str);
        if (c0y8tLJIILIIL == null) {
            return null;
        }
        if (c0y8tLJIILIIL.getLastShowMessage() != null && str2.equals(c0y8tLJIILIIL.getLastShowMessage().getUuid())) {
            z = true;
        } else {
            z = false;
        }
        boolean zIsMention = c869590Y9l.isMention(this.LIZJ.LJ().LJ().getUid());
        if (!z) {
            if (!zIsMention) {
                return null;
            }
        } else {
            this.LIZLLL.LJIIJJI().LJJJZ(this.LIZLLL.LJI().LJJIIJZLJL(str));
        }
        return this.LIZLLL.LJIIJJI().LIZ(str, true);
    }

    public final void LJIJ(long j, final long j2, final String str, final String str2) {
        final long uid = this.LIZJ.LJ().LJ().getUid();
        C870180YBs c870180YBsLIZ = this.LIZJ.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.LL.postDelayed(new Runnable() { // from class: X.0Xvg
            @Override // java.lang.Runnable
            public final void run() {
                C864930XwR c864930XwR = this.LL;
                long j3 = uid;
                String str3 = str;
                String str4 = str2;
                long j4 = j2;
                c864930XwR.getClass();
                C1C7U.LIZ("DeleteMsgHandler@32c6.scheduleDeferredCommit$1L");
                if (c864930XwR.LIZJ.LJ().LJ().getUid() != j3) {
                    c864930XwR.LIZJ.LIZLLL().LIZJ("DeleteMsgHandler", "commitDelete skipped: uid changed since scheduling");
                    C1C7U.LIZIZ("DeleteMsgHandler@32c6.scheduleDeferredCommit$1L");
                } else {
                    c864930XwR.LJIIJJI(j4, str3, str4);
                    C1C7U.LIZIZ("DeleteMsgHandler@32c6.scheduleDeferredCommit$1L");
                }
            }
        }, j);
    }

    public final void LJIIL(int i, long j, long j2, int i2, String str) {
        this.LJII = i;
        if (this.LJ) {
            C0Y15 c0y15 = new C0Y15();
            c0y15.LJ = Long.valueOf(j);
            c0y15.LIZLLL = Long.valueOf(j2);
            DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBodyBuild = c0y15.build();
            C1ES0 c1es0 = new C1ES0();
            c1es0.LJJJJL = deleteStrangerMessageRequestBodyBuild;
            this.LJIIIIZZ = c1es0.build();
        } else {
            C0Y14 c0y14 = new C0Y14();
            c0y14.LIZLLL = str;
            c0y14.LJ = Long.valueOf(j);
            c0y14.LJFF = Integer.valueOf(i2);
            c0y14.LJI = Long.valueOf(j2);
            DeleteMessageRequestBody deleteMessageRequestBodyBuild = c0y14.build();
            C1ES0 c1es02 = new C1ES0();
            c1es02.LJJIJL = deleteMessageRequestBodyBuild;
            this.LJIIIIZZ = c1es02.build();
        }
        LJIIZILJ();
        LJIIIZ(i, this.LJIIIIZZ, null, new Object[0]);
    }
}
