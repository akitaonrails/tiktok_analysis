package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I93, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.sticker.emojislider.util.EmojiSliderConsumptionAnimUtil$getEmojiDisappearAnim$1$1$onAnimationEnd$1", f = "EmojiSliderConsumptionAnimUtil.kt", l = {227}, m = "invokeSuspend")
public final class C0I93 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0I94 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I93(C0I94 c0i94, InterfaceC1364105Vn<? super C0I93> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0i94;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0I93(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<NormalTrackTimeStamp> listLIZIZ;
        NormalTrackTimeStamp normalTrackTimeStamp;
        C1C7U.LIZ("EmojiSliderConsumptionAnimUtil@10b9.getEmojiDisappearAnim$1$1$onAnimationEnd$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("EmojiSliderConsumptionAnimUtil@10b9.getEmojiDisappearAnim$1$1$onAnimationEnd$1");
                return objLJFF;
            }
        }
        C0I94 c0i94 = this.LLILLJJLI;
        if (c0i94.LIZ != null && c0i94.LIZIZ != null && (listLIZIZ = C19580611jA.LIZIZ(c0i94.LJ)) != null && (normalTrackTimeStamp = (NormalTrackTimeStamp) C13LP.LJJJLZIJ(0, listLIZIZ)) != null) {
            Float scale = normalTrackTimeStamp.getScale();
            float rotation = normalTrackTimeStamp.getRotation();
            C450720Hlu c450720Hlu = new C450720Hlu(c0i94.LJFF);
            c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
            c450720Hlu.LLILZ = c0i94.LJFF.getString(2131833870);
            c450720Hlu.LLILLJJLI.LJII = 2000L;
            c450720Hlu.LJI(C960203pA.LIZ(R.attr.a0d, c0i94.LJFF));
            ImageView imageView = c0i94.LIZIZ;
            float fFloatValue = scale.floatValue();
            RectF rectF = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
            Matrix matrix = new Matrix();
            matrix.postScale(fFloatValue, fFloatValue, imageView.getPivotX(), imageView.getPivotY());
            matrix.postRotate(rotation, imageView.getPivotX(), imageView.getPivotY());
            matrix.mapRect(rectF);
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            imageView.getLocationOnScreen(new int[2]);
            PointF pointF = new PointF(fCenterX + r2[0], fCenterY + r2[1]);
            c450720Hlu.LIZ((int) pointF.x, ((int) pointF.y) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)));
            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
            c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0Hza
                @Override // X.InterfaceC1340660kzY
                public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                    C1440005kM.LIZ(new C453940Hr6(false, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
                }
            });
            c0p0tLIZIZ.show();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmojiSliderConsumptionAnimUtil@10b9.getEmojiDisappearAnim$1$1$onAnimationEnd$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
