package X;

import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.ugc.aweme.creation.base.BasicModel;

/* JADX INFO: renamed from: X.0MOV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOV {
    public final CreationConfigModelCompat LIZ;

    public final CreativeInfo LIZ() {
        String strLIZ;
        BasicModel basic = this.LIZ.getBasic();
        if (basic == null || (strLIZ = basic.getCreationId()) == null) {
            strLIZ = C0DMI.LIZ();
        }
        return new CreativeInfo(strLIZ, 0, null, 6, null);
    }

    public C0MOV(CreationConfigModelCompat creationConfigModelCompat) {
        this.LIZ = creationConfigModelCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, com.ss.android.ugc.aweme.creative.model.MusicShareStoryData] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r27, X.InterfaceC497601wk r28, X.InterfaceC1364105Vn<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MOV.LIZIZ(android.content.Context, X.01wk, X.05Vn):java.lang.Object");
    }
}
