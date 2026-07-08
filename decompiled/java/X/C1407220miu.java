package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.0miu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407220miu extends AbstractC1434490nQt {
    public final VideoPublishEditModel LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(384));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(383));
    public C1431070nLN LLJ;

    public static final Keva LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_self_keva_repo_");
        sbLIZ.append(o.LJIIZILJ.getCurrentUserID());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.AI_SELF_UPLOAD;
    }

    public C1407220miu(VideoPublishEditModel videoPublishEditModel) {
        this.LLILZLL = videoPublishEditModel;
    }

    public static String LJIILLIIL(String str) {
        if (a0.LJJIIZI(str, "file://", false)) {
            return u.LJJIFFI(str, "file://", "", false);
        }
        return str;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        C2296808zG.LIZJ((InterfaceC497601wk) this.LLIZ.getValue(), null);
        return true;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        this.LLJ = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    AISelfModel aISelfModel = ((C1434960nRe) next).LIZ.creativeModel.aiSelfModel;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1404770mex) {
                            if (next2 != null) {
                                UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) ((C1404770mex) next2).LIZ;
                                Keva kevaLJIILL = LJIILL();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(aISelfModel.taskId);
                                sbLIZ.append("_ai_self_upload");
                                boolean z = kevaLJIILL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                                if (Intrinsics.LJFF(aISelfModel.isChildStyle, Boolean.TRUE) && !z) {
                                    C23250099c.LIZLLL((InterfaceC497601wk) this.LLIZ.getValue(), null, null, new C1407270miz(aISelfModel, uploadAuthKeyConfig, this, null), 3);
                                } else {
                                    C1431070nLN c1431070nLN2 = this.LLJ;
                                    if (c1431070nLN2 == null) {
                                        c1431070nLN2 = null;
                                    }
                                    c1431070nLN2.LJ(null, false);
                                }
                                if (this.LLILZLL.isIfAiMeStyleUsed().booleanValue()) {
                                    C23250099c.LIZLLL((InterfaceC497601wk) this.LLIZ.getValue(), null, null, new C1407260miy(aISelfModel, uploadAuthKeyConfig, this, null), 3);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r14, X.InterfaceC1364105Vn<? super java.lang.String> r15) {
        /*
            r13 = this;
            r10 = r14
            boolean r0 = r15 instanceof X.C1407230miv
            if (r0 == 0) goto L5e
            r12 = r15
            X.0miv r12 = (X.C1407230miv) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r12.LLILZ = r2
        L13:
            java.lang.Object r9 = r12.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r12.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L31
            if (r2 == r0) goto L3f
            if (r2 != r1) goto L65
            java.lang.Object r10 = r12.LL
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r9)
        L2a:
            java.lang.String r0 = LJIILLIIL(r10)
            if (r0 != 0) goto L64
        L30:
            return r10
        L31:
            X.C155000ia.LIZIZ(r9)
            r12.LL = r10
            r12.LLILZ = r0
            java.lang.Object r9 = X.C2169208eg.LIZ(r10, r12)
            if (r9 != r3) goto L46
            return r3
        L3f:
            java.lang.Object r10 = r12.LL
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r9)
        L46:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L30
            r12.LL = r10
            r12.LLILZ = r1
            r4 = 144(0x90, float:2.02E-43)
            r6 = 18
            r8 = 20
            r11 = 0
            r5 = r4
            r7 = r6
            java.lang.Object r0 = X.C2169208eg.LIZIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r3) goto L2a
            return r3
        L5e:
            X.0miv r12 = new X.0miv
            r12.<init>(r13, r15)
            goto L13
        L64:
            return r0
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407220miu.LJIILJJIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJIIZILJ(String str, String str2, String str3, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("root_style_id", str2);
        c0lab.LJ("style_id", str3);
        c0lab.LJ("fail_reason", str);
        c0lab.LJFF("is_success", z);
        C20684815ws.LJIILLIIL("aime_style_icon_upload", c0lab.LIZ);
    }
}
