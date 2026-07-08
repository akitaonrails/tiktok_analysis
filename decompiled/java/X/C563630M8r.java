package X;

import Y.AgS289S0100000_8;
import androidx.activity.OnBackPressedDispatcher;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerMainPageKt$MediaPickerMainPage$3$1", f = "MediaPickerMainPage.kt", l = {109, 113}, m = "invokeSuspend")
public final class C563630M8r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLL;
    public final /* synthetic */ OnBackPressedDispatcher LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563630M8r(C05P0<Boolean> c05p0, SocialMediaPickerViewModel socialMediaPickerViewModel, OnBackPressedDispatcher onBackPressedDispatcher, InterfaceC1364105Vn<? super C563630M8r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = socialMediaPickerViewModel;
        this.LLILZ = onBackPressedDispatcher;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563630M8r(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC563570M8l interfaceC563570M8lLIZIZ;
        C01S9<Unit> c01s9LJ;
        C1C7U.LIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILLJJLI.getValue().booleanValue()) {
                SocialMediaPickerViewModel socialMediaPickerViewModel = this.LLILLL;
                C0LGY c0lgy = C0LGY.LIZ;
                C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
                c0lgy.getClass();
                socialMediaPickerViewModel.onEvent$social_creation_mediapicker_release(new C563470M8b(C0LGY.LIZIZ(c0l91)));
                this.LLILLJJLI.setValue(true);
            }
            AnonymousClass0950 anonymousClass0950 = this.LLILLL.LLJJJ;
            C0JEA c0jea = new C0JEA(this.LLILZ, null);
            this.LL = 1;
            if (C09IC.LJII(anonymousClass0950, this, c0jea) == objLJFF) {
                C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$3$1");
                return objLJFF;
            }
        }
        C0M8Q c0m8q = this.LLILLL.LLJ;
        if (c0m8q != null && (interfaceC563570M8lLIZIZ = c0m8q.LIZIZ()) != null && (c01s9LJ = interfaceC563570M8lLIZIZ.LJ()) != null) {
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLL, 28);
            this.LL = 2;
            if (c01s9LJ.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$3$1");
                return objLJFF;
            }
            throw new C2197108jB();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
