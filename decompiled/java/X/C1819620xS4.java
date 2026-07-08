package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0xS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819620xS4 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(297));

    public static final C0JBN LIZ() {
        return ((IImageService) LIZ.getValue()).a40();
    }

    public static final boolean LIZJ(String str) {
        return ((IImageService) LIZ.getValue()).Ej1(str);
    }

    public static final boolean LIZLLL(ImageModel imageModel) {
        if (imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() > 0) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(String str, Function1<? super Boolean, Unit> function1) {
        ((IImageService) LIZ.getValue()).SP0(str, function1);
    }
}
