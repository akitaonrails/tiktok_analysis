package X;

import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourcePreloadModel;

/* JADX INFO: renamed from: X.0QjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678580QjY implements InterfaceC20160013uQ {
    public static final C678580QjY LIZ = new C678580QjY();
    public static final EcomResourcePreloadModel[] LIZIZ;

    static {
        EcomResourcePreloadModel[] ecomResourcePreloadModelArr = new EcomResourcePreloadModel[0];
        EcomResourcePreloadModel[] ecomResourcePreloadModelArr2 = (EcomResourcePreloadModel[]) C0C64.LJIILLIIL().LJJII(EcomResourcePreloadModel[].class, ecomResourcePreloadModelArr, "ecom_resource_preload_config_ext1", true);
        if (ecomResourcePreloadModelArr2 != null) {
            ecomResourcePreloadModelArr = ecomResourcePreloadModelArr2;
        }
        LIZIZ = ecomResourcePreloadModelArr;
    }

    @Override // X.InterfaceC20160013uQ
    public final EcomResourcePreloadModel[] LIZ() {
        return LIZIZ;
    }
}
