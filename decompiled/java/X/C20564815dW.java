package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.smartparams.AdaptionRegularResultOperator;
import kotlin.jvm.internal.AwS466S0200000_31;

/* JADX INFO: renamed from: X.15dW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20564815dW extends AbstractC20562115d5 {
    public static final C20568515e7 LLILZ = new Object() { // from class: X.15e7
    };
    public static C20564815dW LLILZIL;
    public final C20566115dj LLILLJJLI;
    public final String LLILLL = "smart_crop_handler";

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILLL;
    }

    public C20564815dW(C20566115dj c20566115dj) {
        this.LLILLJJLI = c20566115dj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.15dq, X.15dy] */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.15dq, X.15e0] */
    @Override // X.AbstractC20562115d5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult LIZ(com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams r29, com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult r30) {
        /*
            Method dump skipped, instruction units count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20564815dW.LIZ(com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams, com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult):com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult");
    }

    public final boolean LIZIZ(C20567815e0 c20567815e0, C20567615dy c20567615dy, AdaptionRegularResultOperator adaptionRegularResultOperator, boolean z) {
        AwS466S0200000_31 awS466S0200000_31 = new AwS466S0200000_31(this, adaptionRegularResultOperator, 9);
        boolean z2 = false;
        for (T t : c20567615dy.LIZ) {
            for (T t2 : c20567815e0.LIZ) {
                if (C20565015dY.LIZ(t2, t)) {
                    awS466S0200000_31.invoke(t2, t);
                    z2 = true;
                }
            }
        }
        adaptionRegularResultOperator.setNeedSave(z);
        return z2;
    }
}
