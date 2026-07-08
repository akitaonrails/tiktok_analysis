package X;

import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11vX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19657311vX extends FrameLayout {
    public C1664680tQA<C19656711vR> LL;
    public LifecycleOwner LLILLJJLI;
    public InterfaceC388760FMc LLILLL;
    public C19656911vT LLILZ;
    public TuxTextView LLILZIL;
    public C12UW LLILZLL;
    public TuxIconView LLIZ;
    public ImageView LLIZLLLIL;
    public ImageView LLJ;
    public CutMultiVideoViewModel LLJI;
    public C19560811fy LLJIJIL;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ() {
        C1664680tQA<C19656711vR> c1664680tQA = this.LL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11va
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19656711vR) obj).LIZJ);
            }
        });
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 753));
        C1664680tQA<C19656711vR> c1664680tQA2 = this.LL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11vZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C19656711vR) obj).LJ);
            }
        });
        C1664680tQA<C19656711vR> c1664680tQA3 = this.LL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        C19658411vi c19658411vi = new C19658411vi(liveStateLIZ2, c1664680tQA3.LIZ(new C2217381BqS() { // from class: X.11vY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C19656711vR) obj).LJFF);
            }
        }));
        LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
        if (lifecycleOwner2 == null) {
            lifecycleOwner2 = null;
        }
        c19658411vi.LIZJ.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new C5183020f((Function2) new AwS643S0100000_29(this, 142), (Function2<Object, Object, Object>) 189));
        C1664680tQA<C19656711vR> c1664680tQA4 = this.LL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA4.LIZ(new C2217381BqS() { // from class: X.11vW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19656711vR) obj).LIZLLL;
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLILLJJLI;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 754));
        C1664680tQA<C19656711vR> c1664680tQA5 = this.LL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA5.LIZ(new C2217381BqS() { // from class: X.11vS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19656711vR) obj).LIZIZ);
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLILLJJLI;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ4.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 755));
        C1664680tQA<C19656711vR> c1664680tQA6 = this.LL;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        LiveState<V> liveStateLIZ5 = c1664680tQA6.LIZ(new C2217381BqS() { // from class: X.11vb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19656711vR) obj).LJI);
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLILLJJLI;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        liveStateLIZ5.LJIIIZ(lifecycleOwner5, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 751));
        C1664680tQA<C19656711vR> c1664680tQA7 = this.LL;
        if (c1664680tQA7 == null) {
            c1664680tQA7 = null;
        }
        LiveState<V> liveStateLIZ6 = c1664680tQA7.LIZ(new C2217381BqS() { // from class: X.11vc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C19656711vR) obj).LJII);
            }
        });
        LifecycleOwner lifecycleOwner6 = this.LLILLJJLI;
        if (lifecycleOwner6 == null) {
            lifecycleOwner6 = null;
        }
        liveStateLIZ6.LJIIIZ(lifecycleOwner6, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 752));
        VideoEditViewModel videoEditViewModel = getVideoEditView().getVideoEditViewModel();
        MutableLiveData<Void> mutableLiveData = videoEditViewModel.LLIZ;
        LifecycleOwner lifecycleOwner7 = this.LLILLJJLI;
        if (lifecycleOwner7 == null) {
            lifecycleOwner7 = null;
        }
        mutableLiveData.observe(lifecycleOwner7, new AObserverS231S0100000_29(this, 231));
        MutableLiveData<Void> mutableLiveData2 = videoEditViewModel.LLJ;
        LifecycleOwner lifecycleOwner8 = this.LLILLJJLI;
        if (lifecycleOwner8 == null) {
            lifecycleOwner8 = null;
        }
        mutableLiveData2.observe(lifecycleOwner8, new AObserverS231S0100000_29(this, 232));
        MutableLiveData<Void> mutableLiveData3 = videoEditViewModel.LLILZLL;
        LifecycleOwner lifecycleOwner9 = this.LLILLJJLI;
        if (lifecycleOwner9 == null) {
            lifecycleOwner9 = null;
        }
        mutableLiveData3.observe(lifecycleOwner9, new AObserverS231S0100000_29(this, 233));
        MutableLiveData<Void> mutableLiveData4 = videoEditViewModel.LLIZLLLIL;
        LifecycleOwner lifecycleOwner10 = this.LLILLJJLI;
        if (lifecycleOwner10 == null) {
            lifecycleOwner10 = null;
        }
        mutableLiveData4.observe(lifecycleOwner10, new AObserverS231S0100000_29(this, 234));
        MutableLiveData<Void> mutableLiveData5 = videoEditViewModel.LLJI;
        LifecycleOwner lifecycleOwner11 = this.LLILLJJLI;
        if (lifecycleOwner11 == null) {
            lifecycleOwner11 = null;
        }
        mutableLiveData5.observe(lifecycleOwner11, new AObserverS231S0100000_29(this, 235));
        MutableLiveData<Void> mutableLiveData6 = videoEditViewModel.LLJIJIL;
        LifecycleOwner lifecycleOwner12 = this.LLILLJJLI;
        if (lifecycleOwner12 == null) {
            lifecycleOwner12 = null;
        }
        mutableLiveData6.observe(lifecycleOwner12, new AObserverS231S0100000_29(this, 236));
        MutableLiveData<Long> mutableLiveData7 = videoEditViewModel.LLILZIL;
        LifecycleOwner lifecycleOwner13 = this.LLILLJJLI;
        if (lifecycleOwner13 == null) {
            lifecycleOwner13 = null;
        }
        mutableLiveData7.observe(lifecycleOwner13, new AObserverS231S0100000_29(this, 237));
        MutableLiveData<Boolean> mutableLiveData8 = videoEditViewModel.LLILLL;
        LifecycleOwner lifecycleOwner14 = this.LLILLJJLI;
        mutableLiveData8.observe(lifecycleOwner14 != null ? lifecycleOwner14 : null, new AObserverS231S0100000_29(this, 238));
    }

    public final void LIZJ() {
        CharSequence string;
        C1664680tQA<C19656711vR> c1664680tQA = this.LL;
        float f = (c1664680tQA == null ? null : c1664680tQA).LIZ.LJ;
        float f2 = (c1664680tQA == null ? null : c1664680tQA).LIZ.LJFF;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (Intrinsics.LJFF(c1664680tQA.LIZ.LIZLLL, Boolean.TRUE)) {
            string = getContext().getResources().getString(2131849916);
        } else {
            float f3 = (f2 - f) / LSPassThroughRecordSizeConfig.DEFAULT;
            boolean z = ((double) (0.99f * f3)) < 0.1d;
            String strK4 = C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
            String string2 = getContext().getResources().getString(2131836172, strK4);
            if (z) {
                SpannableString spannableString = new SpannableString(string2);
                int iLJJJ = a0.LJJJ(string2, strK4, 0, false, 6);
                int iLJJJ2 = a0.LJJJ(string2, strK4, 0, false, 6) + strK4.length();
                int iLIZ = C960203pA.LIZ(R.attr.a04, getContext());
                int i = iLJJJ > 0 ? iLJJJ : 0;
                boolean zIsEmpty = TextUtils.isEmpty(spannableString);
                string = spannableString;
                string = spannableString;
                if (!zIsEmpty && i <= iLJJJ2) {
                    int length = spannableString.length();
                    string = spannableString;
                    if (i < length) {
                        int length2 = spannableString.length();
                        string = spannableString;
                        if (iLJJJ2 <= length2) {
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZ), i, iLJJJ2, 17);
                            string = spannableString;
                        }
                    }
                }
            } else {
                string = string2;
            }
        }
        TuxTextView tuxTextView = this.LLILZIL;
        (tuxTextView != null ? tuxTextView : null).setText(string);
    }

    public final ImageView getCancelButton() {
        ImageView imageView = this.LLJ;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    public final CutMultiVideoViewModel getMultiVideoVideoModel() {
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJI;
        if (cutMultiVideoViewModel != null) {
            return cutMultiVideoViewModel;
        }
        return null;
    }

    public final TuxIconView getPlayButton() {
        TuxIconView tuxIconView = this.LLIZ;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final ImageView getSaveButton() {
        ImageView imageView = this.LLIZLLLIL;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    public final C12UW getVideoEditView() {
        C12UW c12uw = this.LLILZLL;
        if (c12uw != null) {
            return c12uw;
        }
        return null;
    }

    public C19657311vX(Context context) {
        super(context, null, 0);
    }

    public final void LIZIZ(int i) {
        InterfaceC1452170ntP interfaceC1452170ntPLJII;
        InterfaceC1452170ntP interfaceC1452170ntPLJII2;
        Integer numValueOf;
        InterfaceC388760FMc interfaceC388760FMc = this.LLILLL;
        InterfaceC388760FMc interfaceC388760FMc2 = null;
        if (interfaceC388760FMc == null) {
            interfaceC388760FMc = null;
        }
        InterfaceC386690FEd interfaceC386690FEdLIZIZ = interfaceC388760FMc.LIZIZ();
        if (interfaceC386690FEdLIZIZ != null && (interfaceC1452170ntPLJII2 = interfaceC386690FEdLIZIZ.LJII()) != null && (numValueOf = Integer.valueOf(interfaceC1452170ntPLJII2.Te(i))) != null) {
            i = numValueOf.intValue();
        }
        InterfaceC388760FMc interfaceC388760FMc3 = this.LLILLL;
        if (interfaceC388760FMc3 != null) {
            interfaceC388760FMc2 = interfaceC388760FMc3;
        }
        InterfaceC386690FEd interfaceC386690FEdLIZIZ2 = interfaceC388760FMc2.LIZIZ();
        if (interfaceC386690FEdLIZIZ2 != null && (interfaceC1452170ntPLJII = interfaceC386690FEdLIZIZ2.LJII()) != null) {
            interfaceC1452170ntPLJII.nf(i, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
        }
    }

    public final void setCancelButton(ImageView imageView) {
        this.LLJ = imageView;
    }

    public final void setMultiVideoVideoModel(CutMultiVideoViewModel cutMultiVideoViewModel) {
        this.LLJI = cutMultiVideoViewModel;
    }

    public final void setPlayButton(TuxIconView tuxIconView) {
        this.LLIZ = tuxIconView;
    }

    public final void setSaveButton(ImageView imageView) {
        this.LLIZLLLIL = imageView;
    }

    public final void setVideoEditView(C12UW c12uw) {
        this.LLILZLL = c12uw;
    }
}
