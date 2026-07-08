package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0oQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472820oQi extends C1469760oLm {
    public boolean LLILLL;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null && this.LLILLL) {
            player.LIZJ(7, 1);
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJIIJIL() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null && C1474810oTv.LLJJL() > 0 && C1472830oQj.LIZIZ < C1474810oTv.LLJJL() && this.LLILLL) {
            String strLJJLIIIJJIZ = player.LJJLIIIJJIZ(957);
            C01GW c01gw = C1472830oQj.LIZ;
            String string = ((Keva) c01gw.getValue()).getString("key_codec_best_name", "");
            if (TextUtils.isEmpty(strLJJLIIIJJIZ) || string.contains(strLJJLIIIJJIZ)) {
                return;
            }
            if (TextUtils.isEmpty(string)) {
                ((Keva) c01gw.getValue()).storeString("key_codec_best_name", strLJJLIIIJJIZ);
            } else {
                ((Keva) c01gw.getValue()).storeString("key_codec_best_name", string.concat(",#,").concat(strLJJLIIIJJIZ));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.util.SparseIntArray] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0oPd, com.ss.ttvideoengine.TTVideoEngine] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(java.util.Map<java.lang.String, java.lang.Object> r18) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472820oQi.LJJIIJZLJL(java.util.Map):void");
    }

    public C1472820oQi(InterfaceC1471960oPK interfaceC1471960oPK, boolean z) {
        super(interfaceC1471960oPK);
        this.LLILLL = z;
    }
}
