package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12J3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C12J3 extends C2217421BqW implements Function2<String, String, int[]> {
    public C12J3(C12J9 c12j9) {
        super(2, c12j9, C12J9.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final int[] invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C12J7 c12j7 = ((C12J9) this.receiver).LIZJ;
        if (c12j7 != null) {
            return c12j7.LJJLL(str3, str4);
        }
        return null;
    }
}
