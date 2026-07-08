package X;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868990Y7d extends AbstractC867440Y1e {
    public final int LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public int LJIJJ;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    public final long LJIILIIL() {
        long jLJJJJLI = this.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJJJLI(this.LJ, C0YFV.CURSOR_TYPE_PRIORITY_MSG_CHAIN);
        if (jLJJJJLI < 0) {
            return 0L;
        }
        return jLJJJJLI;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && responseBody.messages_per_user_init_v2_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILJJIL(boolean z) {
        this.LJFF = z;
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMInitHandler init, isRetry:");
        sbLIZ.append(z);
        sbLIZ.append(", inbox:");
        sbLIZ.append(this.LJ);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJ(this.LJ)) {
            this.LIZJ.LIZLLL().LJIIJJI("IMInitHandler init, already doing, return");
            return;
        }
        if (!z) {
            C868140Y3w c868140Y3w = this.LIZJ.LJIIZILJ().getDomain().LIZIZ;
            int i = this.LJ;
            ((CopyOnWriteArraySet) c868140Y3w.LIZIZ).add(Integer.valueOf(i));
            C871360YGg c871360YGg = c868140Y3w.LIZ.LJIIZILJ().getDomain().LIZLLL;
            c871360YGg.getClass();
            c871360YGg.LJ(InterfaceC871310YGb.LIZIZ, new C868150Y3x(C0YMI.STARTED));
        }
        if (this.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJIIJJI(this.LJ)) {
            this.LIZJ.LIZLLL().LJIIJJI("IMInitHandler init, already inited");
            this.LIZJ.LJIIZILJ().getDomain().LIZLLL.LJFF(this.LJ, 3);
            LJIIJJI(false, false);
            return;
        }
        if (this.LJ == 0) {
            this.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJIJJLI();
        }
        this.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJIZ();
        C868140Y3w c868140Y3w2 = this.LIZJ.LJIIZILJ().getDomain().LIZIZ;
        int i2 = this.LJ;
        ((CopyOnWriteArraySet) c868140Y3w2.LJ).add(Integer.valueOf(i2));
        this.LIZJ.LJIIZILJ().getDomain().LIZLLL.LJFF(this.LJ, 0);
        this.LJIIJ = SystemClock.uptimeMillis();
        LJIIL(this.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJJJLL(this.LJ), LJIILIIL());
    }

    public C868990Y7d(C0YEM c0yem, int i) {
        super(c0yem, C0YMR.GET_MESSAGES_BY_USER_INIT_V2.getValue(), null);
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJIJI = 0L;
        this.LJIJJ = 0;
        this.LJ = i;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        boolean z;
        String str;
        Response response;
        this.LJIIL += SystemClock.uptimeMillis() - this.LJIIJJI;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z2 = true;
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            z = true;
        } else {
            z = false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMInitHandler handleResponse, logId: ");
        sbLIZ.append(c0yin.LJIIIZ());
        sbLIZ.append(" seqId:");
        sbLIZ.append(c0yin.LL);
        sbLIZ.append(", isSuccess:");
        sbLIZ.append(z);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LJII++;
            final MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = c0yin.LLIZ.body.messages_per_user_init_v2_body;
            if (messagesPerUserInitV2ResponseBody.init_type != C0YQW.TYPE_BY_USER) {
                z2 = false;
            }
            this.LJI = z2;
            final long jUptimeMillis2 = SystemClock.uptimeMillis();
            this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<Pair<Long, Long>>() { // from class: X.0Y7W
                /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:4)(8:6|(3:8|(1:10)(1:33)|11)|12|(3:14|(1:16)(1:32)|17)|18|(3:20|(1:22)(1:31)|23)|24|(3:26|(1:28)(1:30)|29))|5|(5:226|34|35|(1:37)|38)|(7:220|41|(4:202|43|236|235)(4:234|44|(3:233|46|238)(5:232|47|224|48|(21:200|50|(7:52|(1:60)|61|(1:63)|64|(1:72)|73)(1:74)|75|(1:77)(1:78)|79|(1:81)(1:82)|83|(1:85)(1:86)|87|(1:89)(1:90)|91|(1:93)|94|204|95|210|96|214|97|237)(0))|235)|193|194|230|39)|206|112|(5:218|115|198|116|113)|208|117|(15:222|119|(5:122|(1:124)(1:125)|126|(11:128|(1:133)(1:132)|134|196|135|228|136|(3:138|139|(1:141)(1:142))|143|(1:245)(3:241|147|(3:242|149|247)(1:246))|243)(0)|120)|240|154|(3:156|(4:159|(3:248|161|252)(1:251)|250|157)|249)|162|(1:164)|165|212|170|216|171|(1:173)(1:175)|174)(6:212|170|216|171|(0)(0)|174)|193|194|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:180:0x05fd, code lost:
                
                    r5 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:182:0x05ff, code lost:
                
                    r5 = e;
                 */
                /* JADX WARN: Removed duplicated region for block: B:133:0x0447  */
                /* JADX WARN: Removed duplicated region for block: B:173:0x05de A[Catch: Exception -> 0x05f9, TryCatch #10 {Exception -> 0x05f9, blocks: (B:171:0x05d5, B:173:0x05de, B:174:0x05e2), top: B:216:0x05d5 }] */
                /* JADX WARN: Removed duplicated region for block: B:175:0x05f6  */
                /* JADX WARN: Removed duplicated region for block: B:191:0x0640  */
                /* JADX WARN: Removed duplicated region for block: B:195:0x0673  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x02ef A[Catch: Exception -> 0x03a3, TRY_ENTER, TryCatch #14 {Exception -> 0x03a3, blocks: (B:48:0x0247, B:75:0x0315, B:79:0x033c, B:83:0x0347, B:87:0x0352, B:91:0x035d, B:94:0x0363, B:90:0x0359, B:86:0x034e, B:82:0x0343, B:78:0x0330, B:74:0x02ef), top: B:224:0x0247 }] */
                @Override // X.InterfaceC872410YKh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final android.util.Pair<java.lang.Long, java.lang.Long> LIZ() {
                    /*
                        Method dump skipped, instruction units count: 1654
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0Y7W.LIZ():java.lang.Object");
                }
            }, new InterfaceC864800XwE<Pair<Long, Long>>() { // from class: X.0Y7e
                @Override // X.InterfaceC864800XwE
                public final void LIZ(Pair<Long, Long> pair) {
                    long jLJIILIIL;
                    this.LJIILLIIL += SystemClock.uptimeMillis() - jUptimeMillis2;
                    long jUptimeMillis3 = SystemClock.uptimeMillis();
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("IMInitHandler handleResponse onCallback, has_more:");
                    sbLIZ2.append(messagesPerUserInitV2ResponseBody.has_more);
                    sbLIZ2.append(", nextCursor:");
                    sbLIZ2.append(messagesPerUserInitV2ResponseBody.next_cursor);
                    sbLIZ2.append(", isByUser:");
                    sbLIZ2.append(this.LJI);
                    sbLIZ2.append(", seqId:");
                    sbLIZ2.append(c0yin.LL);
                    c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                    if (messagesPerUserInitV2ResponseBody.has_more.booleanValue() && messagesPerUserInitV2ResponseBody.next_cursor != null) {
                        C868990Y7d c868990Y7d = this;
                        if (c868990Y7d.LJI) {
                            c868990Y7d.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJJLZIJ(this.LJ, messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                        }
                        this.LJIJ += SystemClock.uptimeMillis() - jUptimeMillis3;
                        C868990Y7d c868990Y7d2 = this;
                        long jLongValue = messagesPerUserInitV2ResponseBody.next_cursor.longValue();
                        Long l = messagesPerUserInitV2ResponseBody.priority_next_cursor;
                        if (l != null) {
                            jLJIILIIL = l.longValue();
                        } else {
                            jLJIILIIL = this.LJIILIIL();
                        }
                        c868990Y7d2.LJIIL(jLongValue, jLJIILIIL);
                        long jUptimeMillis4 = SystemClock.uptimeMillis();
                        if (this.LIZJ.LJIIIZ().LJIILL == 1) {
                            this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LIZJ(true);
                        }
                        this.LJIJ += SystemClock.uptimeMillis() - jUptimeMillis4;
                        return;
                    }
                    this.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJIILJJIL(this.LJ);
                    this.LIZJ.LJIIZILJ().getDomain().LIZLLL.LJFF(this.LJ, 2);
                    this.LJIJ += SystemClock.uptimeMillis() - jUptimeMillis3;
                    this.LJIIJJI(true, true);
                    long jUptimeMillis5 = SystemClock.uptimeMillis();
                    this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LIZJ(true);
                    this.LJIJ += SystemClock.uptimeMillis() - jUptimeMillis5;
                    C870460YCu c870460YCuLIZ = this.LIZJ.LJIIZILJ().LJFF().LIZ();
                    int i = this.LJ;
                    long jUptimeMillis6 = SystemClock.uptimeMillis();
                    C868990Y7d c868990Y7d3 = this;
                    long j = jUptimeMillis6 - c868990Y7d3.LJIIJ;
                    int i2 = c868990Y7d3.LJII;
                    int i3 = c868990Y7d3.LJIIIIZZ;
                    int i4 = c868990Y7d3.LJIIIZ;
                    C0YMW c0ymwFrom = C0YMW.from(c0yin);
                    C868990Y7d c868990Y7d4 = this;
                    c870460YCuLIZ.LJII(true, i, j, i2, i3, i4, c0ymwFrom, c868990Y7d4.LJIIL, c868990Y7d4.LJIILIIL, c868990Y7d4.LJIILJJIL, c868990Y7d4.LJIILL, c868990Y7d4.LJIILLIIL, c868990Y7d4.LJIIZILJ, c868990Y7d4.LJIJ);
                }
            }, false, this.LIZJ.LJIIL().LIZJ());
            return;
        }
        if (this.LJIJJ < 10 && (response = c0yin.LLIZ) != null && response.status_code.intValue() != -1000 && c0yin.LLIZ.body != null) {
            this.LJIJJ++;
            LJIIL(this.LJIJI, LJIILIIL());
            return;
        }
        this.LIZJ.LJIIZILJ().getDomain().LIZLLL.LJFF(this.LJ, 1);
        this.LJIJ += SystemClock.uptimeMillis() - jUptimeMillis;
        LJIIJJI(true, false);
        C870460YCu c870460YCuLIZ = this.LIZJ.LJIIZILJ().LJFF().LIZ();
        int i = this.LJ;
        long jUptimeMillis3 = SystemClock.uptimeMillis() - this.LJIIJ;
        int i2 = this.LJII;
        int i3 = this.LJIIIIZZ;
        int i4 = this.LJIIIZ;
        Response response2 = c0yin.LLIZ;
        if (response2 != null) {
            str = response2.error_desc;
        } else {
            str = "";
        }
        c870460YCuLIZ.LJII(false, i, jUptimeMillis3, i2, i3, i4, C0YMW.from(c0yin, str), this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ);
        this.LIZJ.LJIILIIL().LIZJ("get_by_user_init failure");
    }

    public final void LJIIJJI(boolean z, boolean z2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        ((CopyOnWriteArraySet) this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJ).remove(Integer.valueOf(this.LJ));
        if (!this.LIZJ.LJIIIZ().LJJJLL.isEmpty()) {
            this.LIZJ.LJIIJJI().LIZJ(new C914050ZtT(this, 12), null, false, this.LIZJ.LJIIL().LIZ());
        }
        if (!this.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJJLIIL()) {
            this.LIZJ.LJIIJJI().LIZIZ(new C914050ZtT(this, 11), null);
        }
        this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJIIIIZZ(z);
        if (this.LJFF) {
            this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LIZJ(false);
        } else {
            this.LIZJ.LJIIZILJ().getDomain().LIZJ().LLIIJLIL(this.LJ, 0, null, null, false);
        }
        this.LJIIZILJ += SystemClock.uptimeMillis() - jUptimeMillis;
        this.LIZJ.LJIIZILJ().LIZ().LIZIZ().LJJJJZI();
        C0YCR c0ycrLJIILIIL = this.LIZJ.LJIILIIL();
        int i = this.LJ;
        if (!c0ycrLJIILIIL.LJIJ) {
            C23250099c.LIZLLL(c0ycrLJIILIIL.LJIJJLI, null, null, new C0Y5W(c0ycrLJIILIIL, i, null), 3);
        }
    }

    public final void LJIIL(long j, long j2) {
        this.LIZJ.LJIILIIL().LJIIZILJ = true;
        this.LJIJI = j;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C869010Y7f c869010Y7f = new C869010Y7f();
        c869010Y7f.LIZLLL = Long.valueOf(j);
        this.LIZJ.LJIIIZ().getClass();
        c869010Y7f.LJ = 0;
        this.LIZJ.LJIIIZ().getClass();
        if (this.LIZJ.LJIIIZ().LJJJJLI.isConversationMarkDelete()) {
            c869010Y7f.LJI = Boolean.TRUE;
        }
        if (this.LIZJ.LJIIIZ().LJJLIIIIJ.LJIIL) {
            c869010Y7f.LJIIIIZZ = Long.valueOf(j2);
        }
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJFF = c869010Y7f.build();
        LJIIIZ(this.LJ, c1es0.build(), null, new Object[0]);
        this.LJIILIIL += SystemClock.uptimeMillis() - jUptimeMillis;
        this.LJIIJJI = SystemClock.uptimeMillis();
    }

    public final void LJIILL(final int i, final String str, final String str2, final int i2, final long j, final boolean z) {
        if (!this.LIZJ.LJIIIZ().LJJJJL) {
            return;
        }
        this.LIZJ.LJIIJJI().LIZIZ(new InterfaceC872410YKh<Void>() { // from class: X.0Y7h
            @Override // X.InterfaceC872410YKh
            public final Void LIZ() {
                HashMap map = new HashMap();
                map.put("per_user_cursor", String.valueOf(j));
                map.put("conv_count", String.valueOf(i));
                map.put("msg_count", String.valueOf(i2));
                map.put("is_success", z ? CardStruct.IStatusCode.DEFAULT : "1");
                map.put("error_msg", str);
                map.put("log_id", str2);
                this.LJI.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJJJL(this.LJI.LJ, map.toString());
                return null;
            }
        }, new C914010ZtP(12));
    }
}
