package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.component.StoryUploadingVideoCoverComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08aC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.common.sub.video.component.StoryUploadingVideoCoverComponent$onBind$1$1$1", f = "StoryUploadingVideoCoverComponent.kt", l = {}, m = "invokeSuspend")
public final class C2141408aC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryUploadingVideoCoverComponent LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2141408aC(StoryUploadingVideoCoverComponent storyUploadingVideoCoverComponent, Bitmap bitmap, InterfaceC1364105Vn<? super C2141408aC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyUploadingVideoCoverComponent;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2141408aC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryUploadingVideoCoverComponent@78dd.onBind$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryUploadingVideoCoverComponent storyUploadingVideoCoverComponent = this.LL;
        Bitmap bitmap = this.LLILLJJLI;
        SmartImageView smartImageView = storyUploadingVideoCoverComponent.LLJZIJLIL;
        if (smartImageView != null) {
            if (C2141608aE.LIZ()) {
                smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            smartImageView.setImageBitmap(bitmap);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryUploadingVideoCoverComponent@78dd.onBind$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
