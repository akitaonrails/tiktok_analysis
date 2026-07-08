package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.ui.ImageEditRootScene$applyAutoCutMode$1$2$1", f = "ImageEditRootScene.kt", l = {}, m = "invokeSuspend")
public final class C067I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArrayList<MediaModel> LL;
    public final /* synthetic */ ImageEditRootScene LLILLJJLI;
    public final /* synthetic */ C1DRG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067I(C1DRG c1drg, ImageEditRootScene imageEditRootScene, ArrayList arrayList, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = arrayList;
        this.LLILLJJLI = imageEditRootScene;
        this.LLILLL = c1drg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        ArrayList<MediaModel> arrayList = this.LL;
        return new C067I(this.LLILLL, this.LLILLJJLI, arrayList, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditRootScene@a14e.applyAutoCutMode$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0L53 c0l53 = C0L53.LIZ;
        ArrayList<MediaModel> arrayList = this.LL;
        ImageEditRootScene imageEditRootScene = this.LLILLJJLI;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LLJL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        C1DRG c1drg = this.LLILLL;
        Activity activityRequireActivity = imageEditRootScene.requireActivity();
        c0l53.getClass();
        C0L53.LIZ(arrayList, videoPublishEditModel, c1drg, activityRequireActivity);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditRootScene@a14e.applyAutoCutMode$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
