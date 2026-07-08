package X;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPicker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744920vVa extends C09AY implements Function1<DistrictPickerWrapperState, Animation> {
    public final /* synthetic */ RegionPicker LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744920vVa(RegionPicker regionPicker, int i, boolean z, int i2) {
        super(1);
        this.LL = regionPicker;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Animation invoke(DistrictPickerWrapperState districtPickerWrapperState) {
        DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
        if (districtPickerWrapperState2.getDone() || districtPickerWrapperState2.getTitleBarBack() || districtPickerWrapperState2.getPhysicalBack()) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            return translateAnimation;
        }
        return super/*androidx.fragment.app.Fragment*/.onCreateAnimation(this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }
}
