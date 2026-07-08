package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import java.util.List;

/* JADX INFO: renamed from: X.1AcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183101AcG {
    public final void LIZ(long j, boolean z) {
        List<? extends ImageModel> list;
        List<ImageModel> listLIZ;
        String str;
        C2183141AcK<Long> c2183141AcK = C2183111AcH.LJIILLIIL;
        Long lLIZ = c2183141AcK.LIZ(z);
        if (lLIZ != null && lLIZ.longValue() == j) {
            return;
        }
        c2183141AcK.LIZIZ(Long.valueOf(j), z);
        C959600b4w c959600b4wC0 = C915980Zwa.LJIIIZ().c0();
        if (c959600b4wC0 != null) {
            list = c959600b4wC0.LJ;
        } else {
            list = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStaticCountdownTick, thisUser = ");
        sbLIZ.append(z);
        sbLIZ.append(", previewUserAvatars = ");
        sbLIZ.append(list);
        sbLIZ.append(" object = ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("RandomLinkMicAvatarManager", C2188811AlT.LIZIZ(sbLIZ));
        C2183141AcK<Boolean> c2183141AcK2 = C2183111AcH.LJIIJ;
        if (!c2183141AcK2.LIZ(z).booleanValue()) {
            c2183141AcK2.LIZIZ(Boolean.TRUE, z);
            if (z) {
                C2183111AcH.LJIILIIL.LIZIZ(list, z);
            }
            C2183141AcK<List<ImageModel>> c2183141AcK3 = C2183111AcH.LJIILIIL;
            List<ImageModel> listLIZ2 = c2183141AcK3.LIZ(z);
            if (listLIZ2 != null && listLIZ2.size() >= 5 && (listLIZ = c2183141AcK3.LIZ(z)) != null) {
                for (ImageModel imageModel : listLIZ) {
                    IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
                    List<String> listLIZ3 = C842240X2g.LIZ(imageModel);
                    if (listLIZ3 == null || (str = (String) C13LP.LJJJLZIJ(0, listLIZ3)) == null) {
                        str = "";
                    }
                    iHostFrescoHelper.my0(str);
                }
            }
        }
        C2183141AcK<Integer> c2183141AcK4 = C2183111AcH.LJIIL;
        c2183141AcK4.LIZIZ(Integer.valueOf(c2183141AcK4.LIZ(z).intValue() + 1), z);
        C2183111AcH.LJIILL.LIZIZ(Boolean.FALSE, z);
    }

    public static void LIZIZ(C1099610eil c1099610eil, int i, boolean z, Float f) {
        C2183141AcK<List<ImageModel>> c2183141AcK;
        List<ImageModel> listLIZ;
        List<ImageModel> listLIZ2;
        int size;
        if (c1099610eil != null && f != null && (listLIZ = (c2183141AcK = C2183111AcH.LJIILIIL).LIZ(z)) != null && listLIZ.size() >= 5 && (listLIZ2 = c2183141AcK.LIZ(z)) != null) {
            List<ImageModel> listLIZ3 = c2183141AcK.LIZ(z);
            if (listLIZ3 != null) {
                size = listLIZ3.size();
            } else {
                size = 1;
            }
            ImageModel imageModel = (ImageModel) C13LP.LJJJLZIJ(i % size, listLIZ2);
            if (imageModel != null) {
                C0JSS.LJII(c1099610eil, imageModel);
            }
        }
    }
}
