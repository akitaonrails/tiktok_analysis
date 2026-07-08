package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.ImageModeUtils$processDataForImageMode$1$6", f = "ImageModeUtils.kt", l = {}, m = "invokeSuspend")
public final class C23240098s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<ArrayList<MediaModel>, Unit> LL;
    public final /* synthetic */ ArrayList<MediaModel> LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23240098s(Function1<? super ArrayList<MediaModel>, Unit> function1, ArrayList<MediaModel> arrayList, long j, InterfaceC1364105Vn<? super C23240098s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = arrayList;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23240098s(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageModeUtils@9f6e.processDataForImageMode$1$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C524780Ki4.LIZ.step("av_image_edit", "end processDataForImageMode");
        this.LL.invoke(this.LLILLJJLI);
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLILLL, "duration");
        c0lab.LIZ(this.LLILLJJLI.size(), "pic_cnt");
        C303380Buq.LIZ("tool_performance_edit_photo_mode_decode_duration", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageModeUtils@9f6e.processDataForImageMode$1$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
