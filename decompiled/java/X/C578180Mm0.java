package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Mm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.Video2ImageSwitchProcessor$createImageModeTempImagesTask$1", f = "ImageVideoSeparateModeSwitchApi.kt", l = {584}, m = "invokeSuspend")
public final class C578180Mm0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C578190Mm1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578180Mm0(C578190Mm1 c578190Mm1, InterfaceC1364105Vn<? super C578180Mm0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578190Mm1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578180Mm0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<SingleImageData, Integer> map;
        Object objLJIJ;
        C1C7U.LIZ("Video2ImageSwitchProcessor@f581.createImageModeTempImagesTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1439820nZU c1439820nZU = this.LLILLJJLI.LIZJ().LIZIZ;
            this.LL = 1;
            if (c1439820nZU == null) {
                objLJIJ = Unit.LIZ;
            } else {
                ImageAlbumData imageAlbumData = c1439820nZU.LIZ.getImageAlbumData();
                if (imageAlbumData == null || (map = imageAlbumData.getNeedCompileImages()) == null) {
                    map = new HashMap<>();
                }
                if (map.isEmpty()) {
                    objLJIJ = Unit.LIZ;
                } else {
                    C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                    c2252611DEt.LJIJJ();
                    ImageAlbumData imageAlbumData2 = c1439820nZU.LIZ.getImageAlbumData();
                    if (imageAlbumData2 != null) {
                        C574070MfN.LIZ(c1439820nZU.LIZ.getCreativeInfo(), c1439820nZU.LIZ.creativeModel, imageAlbumData2, map, new AwS552S0100000_8(c2252611DEt, 138));
                    }
                    objLJIJ = c2252611DEt.LJIJ();
                    if (objLJIJ == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                    if (objLJIJ != C099R.LJFF()) {
                        objLJIJ = Unit.LIZ;
                    }
                }
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("Video2ImageSwitchProcessor@f581.createImageModeTempImagesTask$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Video2ImageSwitchProcessor@f581.createImageModeTempImagesTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
