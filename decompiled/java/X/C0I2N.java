package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.aisticker.SingleAIStickerItem;

/* JADX INFO: renamed from: X.0I2N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I2N {
    public final CreativeInfo LIZ;

    public C0I2N(CreativeInfo creativeInfo) {
        this.LIZ = creativeInfo;
    }

    public final Object LIZ(SingleAIStickerItem singleAIStickerItem, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        String str = singleAIStickerItem.localPath;
        if (str.length() > 0) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && c0vsj.length() > 0) {
                return str;
            }
            c0vsj.delete();
        }
        Uri uri = UriProtector.parse(singleAIStickerItem.downloadUrl);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.LJFF = true;
        C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        c1325700kbQLIZLLL.LJFF = c1329360khK;
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), null);
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0I2O
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                if (thLIZLLL == null) {
                    thLIZLLL = new Exception("decode heic file failed: onFailureImpl");
                }
                C098200Yq c098200Yq = new C098200Yq(thLIZLLL);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
                C0I2P c0i2p = C0I2P.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c0i2p.getClass();
                C0I2P.LIZ(0, jCurrentTimeMillis2, 0L, false, 0, -3);
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                if (bitmap == null) {
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                    C098200Yq c098200Yq = new C098200Yq(new Exception("decode heic file failed: null bitmap"));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                    C0I2P c0i2p = C0I2P.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    c0i2p.getClass();
                    C0I2P.LIZ(0, jCurrentTimeMillis2, 0L, false, 0, -1);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C0I2N c0i2n = this;
                c0i2n.getClass();
                sbLIZ.append(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), c0i2n.LIZ, EnumC20228214Cy.AI_STICKER, null, false, 12));
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(".png");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, new C0VSV(strLIZIZ))) {
                    InterfaceC20236714Gf<String> interfaceC20236714Gf2 = c2252611DEt;
                    C189200o6.m2constructorimpl(strLIZIZ);
                    interfaceC20236714Gf2.resumeWith(strLIZIZ);
                    C0I2P c0i2p2 = C0I2P.LIZ;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    long length = new C0VSJ(strLIZIZ).length();
                    c0i2p2.getClass();
                    C0I2P.LIZ(width, jCurrentTimeMillis3, length, true, height, 0);
                    return;
                }
                InterfaceC20236714Gf<String> interfaceC20236714Gf3 = c2252611DEt;
                C098200Yq c098200Yq2 = new C098200Yq(new Exception("decode heic file failed: compress png failed"));
                C189200o6.m2constructorimpl(c098200Yq2);
                interfaceC20236714Gf3.resumeWith(c098200Yq2);
                C0I2P c0i2p3 = C0I2P.LIZ;
                long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                c0i2p3.getClass();
                C0I2P.LIZ(0, jCurrentTimeMillis4, 0L, false, 0, -2);
            }
        }, C822700WPc.LL);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
