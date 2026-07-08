package X;

import Y.AObserverS219S0100000_15;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.EnableMicSeatEmojiFeatureSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewOnClickListenerC939670aYn implements InterfaceC938700aXE<AbstractC938650aX9>, View.OnClickListener {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public int LLILLL = -1;
    public final AObserverS219S0100000_15 LLILZ = new AObserverS219S0100000_15(this, 106);
    public final C11NJ LLILZIL = new C11NJ();
    public final AObserverS219S0100000_15 LLILZLL = new AObserverS219S0100000_15(this, 105);
    public final AObserverS219S0100000_15 LLIZ = new AObserverS219S0100000_15(this, 108);
    public final AObserverS219S0100000_15 LLIZLLLIL = new AObserverS219S0100000_15(this, 107);
    public ViewGroup LLJ;
    public C941290abP LLJI;
    public AbstractC938650aX9 LLJIJIL;
    public ViewGroup LLJILJIL;
    public C941390abZ LLJILJILJ;
    public C1324720kZq LLJILLL;

    @Override // X.InterfaceC938700aXE
    public Long LIZ() {
        return null;
    }

    public int LIZJ() {
        return R.layout.hwj;
    }

    public int LIZLLL() {
        return R.id.ywh;
    }

    public void LJ() {
        C1324720kZq c1324720kZq;
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, this);
        }
        ViewGroup viewGroup2 = this.LLJILJIL;
        if (viewGroup2 == null || (c1324720kZq = (C1324720kZq) viewGroup2.findViewById(R.id.qt3)) == null) {
            return;
        }
        C786410Ut5.e8(c1324720kZq, this);
    }

    public final boolean LJFF() {
        MutableLiveData<C939680aYo> mutableLiveDataLJI;
        C939680aYo value;
        AbstractC938650aX9 abstractC938650aX9 = this.LLJIJIL;
        return (abstractC938650aX9 == null || (mutableLiveDataLJI = abstractC938650aX9.LJI()) == null || (value = mutableLiveDataLJI.getValue()) == null || value.LIZ != C933980aPc.LIZIZ()) ? false : true;
    }

    public void LJIIIIZZ() {
        User userLJIIJ;
        AbstractC938650aX9 abstractC938650aX9 = this.LLJIJIL;
        if (abstractC938650aX9 == null || (userLJIIJ = abstractC938650aX9.LJIIJ()) == null) {
            return;
        }
        AbstractC938650aX9 abstractC938650aX92 = this.LLJIJIL;
        if (abstractC938650aX92 != null) {
            C933980aPc.LJIIIIZZ(abstractC938650aX92.LIZ, abstractC938650aX92.LJIIJ(), abstractC938650aX92.LIZIZ, "anchor_link_guest");
        }
        C0JGU.LIZ(Long.valueOf(userLJIIJ.getId()));
    }

    public void LJIIIZ() {
        DataChannel dataChannel;
        AbstractC939840aZ4 abstractC939840aZ4;
        AbstractC938650aX9 abstractC938650aX9;
        if (!EnableMicSeatEmojiFeatureSetting.INSTANCE.isEnable()) {
            AbstractC938650aX9 abstractC938650aX92 = this.LLJIJIL;
            if (abstractC938650aX92 == null || (dataChannel = abstractC938650aX92.LIZ) == null) {
                return;
            }
            dataChannel.FQ2(ShowUserListDialog.class);
            return;
        }
        C932100aMa c932100aMaLIZ = C932440aN8.LIZ();
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (!(lifecycleOwner instanceof AbstractC939840aZ4) || (abstractC939840aZ4 = (AbstractC939840aZ4) lifecycleOwner) == null || (abstractC938650aX9 = this.LLJIJIL) == null) {
            return;
        }
        abstractC938650aX9.LJIILL(this.LL, abstractC939840aZ4, c932100aMaLIZ);
    }

    public void LJIIJ() {
        ViewGroup viewGroup;
        MutableLiveData<C939680aYo> mutableLiveDataLJI;
        MutableLiveData<ImageModel> mutableLiveDataLJFF;
        MutableLiveData<Integer> mutableLiveDataLJIIJJI;
        LiveData liveData;
        AbstractC938650aX9 abstractC938650aX9 = this.LLJIJIL;
        if (abstractC938650aX9 != null && (liveData = (LiveData) abstractC938650aX9.LJIIL.getValue()) != null) {
            liveData.removeObserver(this.LLIZLLLIL);
        }
        AbstractC938650aX9 abstractC938650aX92 = this.LLJIJIL;
        if (abstractC938650aX92 != null && (mutableLiveDataLJIIJJI = abstractC938650aX92.LJIIJJI()) != null) {
            mutableLiveDataLJIIJJI.removeObserver(this.LLIZ);
        }
        AbstractC938650aX9 abstractC938650aX93 = this.LLJIJIL;
        if (abstractC938650aX93 != null && (mutableLiveDataLJFF = abstractC938650aX93.LJFF()) != null) {
            mutableLiveDataLJFF.removeObserver(this.LLILZLL);
        }
        AbstractC938650aX9 abstractC938650aX94 = this.LLJIJIL;
        if (abstractC938650aX94 != null && (mutableLiveDataLJI = abstractC938650aX94.LJI()) != null) {
            mutableLiveDataLJI.removeObserver(this.LLILZ);
        }
        this.LLILZIL.LJ();
        C941290abP c941290abP = this.LLJI;
        if (c941290abP != null) {
            c941290abP.LIZLLL = true;
        }
        this.LLJI = null;
        this.LLJIJIL = null;
        if (!C931780aM4.LIZ() && (viewGroup = this.LLJILJIL) != null) {
            C930540aK4.LJJIJL(viewGroup);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[unbind] ");
        sbLIZ.append(hashCode());
        C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [REQUEST, X.0kbR] */
    public final void LJI(final ImageModel imageModel) {
        Object tag;
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            final C1324720kZq c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.bxf);
            if (c1324720kZq != null) {
                C12ES.LJIILL(0, c1324720kZq);
            }
            if (imageModel != null && C1819620xS4.LIZLLL(imageModel)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadGaussAvatar imageModel ");
                sbLIZ.append(imageModel.getUri());
                C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ));
                String str = null;
                if (C931780aM4.LIZ() && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().useAvatarCache) {
                    if (c1324720kZq != null) {
                        tag = c1324720kZq.getTag(R.id.bxf);
                    } else {
                        tag = null;
                    }
                    if (Intrinsics.LJFF(tag, imageModel.getUri())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("loadGaussAvatar imageModel is same, skip ");
                        sbLIZ2.append(imageModel.getUri());
                        C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("loadGaussAvatar imageModel load, ");
                sbLIZ3.append(imageModel.getUri());
                C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ3));
                C1291820jim c1291820jim = new C1291820jim(5);
                List urls = imageModel.getUrls();
                if (urls != null) {
                    str = (String) C13LP.LJJJLL(urls);
                }
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                c1325700kbQLIZLLL.LJIILIIL = c1291820jim;
                ?? LIZ = c1325700kbQLIZLLL.LIZ();
                if (c1324720kZq == null) {
                    return;
                }
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LIZLLL = LIZ;
                c1320810kTXLIZJ.LJIILJJIL = c1324720kZq.getController();
                c1320810kTXLIZJ.LJIIIIZZ = new InterfaceC1320650kTH<InterfaceC1330440kj4>() { // from class: X.0JXa
                    @Override // X.InterfaceC1320650kTH
                    public final void LIZ(String str2, Throwable th) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZIZ(String str2) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZLLL(String str2, Throwable th) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJFF(Object obj, String str2) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str2) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJ(String str2, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("loadGaussAvatar imageModel save, ");
                        sbLIZ4.append(imageModel.getUri());
                        C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ4));
                        C1324720kZq c1324720kZq2 = c1324720kZq;
                        if (c1324720kZq2 != null) {
                            c1324720kZq2.setTag(R.id.bxf, imageModel.getUri());
                        }
                    }
                };
                c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
                return;
            }
            C1291820jim c1291820jim2 = new C1291820jim(5);
            C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
            c1325700kbQLIZJ.LJIILIIL = c1291820jim2;
            ?? LIZ2 = c1325700kbQLIZJ.LIZ();
            if (c1324720kZq == null) {
                return;
            }
            C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
            c1320810kTXLIZJ2.LIZLLL = LIZ2;
            c1320810kTXLIZJ2.LJIILJJIL = c1324720kZq.getController();
            c1324720kZq.setController(c1320810kTXLIZJ2.LIZ());
        }
    }

    public final void LJII(final ImageModel imageModel) {
        final ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            View viewFindViewById = viewGroup.findViewById(R.id.bxf);
            if (viewFindViewById != null) {
                C439101nJ.LJI(viewFindViewById);
            }
            final C1324720kZq c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.qt3);
            if (c1324720kZq != null) {
                if (imageModel != null && C1819620xS4.LIZLLL(imageModel)) {
                    if (BugFixVoiceChatAvatarSetting.INSTANCE.enable() && (c1324720kZq.getWidth() == 0 || c1324720kZq.getHeight() == 0)) {
                        C20441214yg.LIZIZ("VoiceChatBasicMask", "avatar size is 0, skip load");
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("imageModel ");
                    sbLIZ.append(imageModel.mUri);
                    C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ));
                    if (C931780aM4.LIZ() && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().useAvatarCache && Intrinsics.LJFF(viewGroup.getTag(R.id.qt3), imageModel.getUri())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("imageModel is same, skip ");
                        sbLIZ2.append(imageModel.mUri);
                        C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("imageModel load, ");
                    sbLIZ3.append(imageModel.getUri());
                    C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ3));
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                    int width = c1324720kZq.getWidth();
                    int height = c1324720kZq.getHeight();
                    c1324610kZfLJIIIZ.LJ = width;
                    c1324610kZfLJIIIZ.LJFF = height;
                    c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                    c1324610kZfLJIIIZ.LJIIL = new C0IYA() { // from class: X.0JXZ
                        @Override // X.C0IYA
                        public final void LJ(boolean z) {
                            if (!z) {
                                c1324720kZq.setBackgroundResource(R.drawable.el_);
                                return;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("imageModel save ");
                            sbLIZ4.append(imageModel.mUri);
                            C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ4));
                            viewGroup.setTag(R.id.qt3, imageModel.getUri());
                        }
                    };
                    c1324610kZfLJIIIZ.LJJI(c1324720kZq);
                    return;
                }
                c1324720kZq.setBackgroundResource(R.drawable.el_);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long lValueOf;
        MutableLiveData<C939680aYo> mutableLiveDataLJI;
        C939680aYo value;
        if (view != null && view.getId() == R.id.qt3) {
            if (LJFF()) {
                LJIIIZ();
                AbstractC938650aX9 abstractC938650aX9 = this.LLJIJIL;
                if (abstractC938650aX9 != null && (mutableLiveDataLJI = abstractC938650aX9.LJI()) != null && (value = mutableLiveDataLJI.getValue()) != null) {
                    lValueOf = Long.valueOf(value.LIZ);
                } else {
                    lValueOf = null;
                }
                C0JGU.LIZ(lValueOf);
                return;
            }
            LJIIIIZZ();
        }
    }

    public ViewOnClickListenerC939670aYn(Context context, LifecycleOwner lifecycleOwner) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r1
      0x0031: PHI (r1v2 android.view.ViewGroup) = (r1v1 android.view.ViewGroup), (r1v16 android.view.ViewGroup) binds: [B:3:0x0010, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZIZ(X.AbstractC938650aX9 r6, android.view.ViewGroup r7) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC939670aYn.LIZIZ(X.0aX9, android.view.ViewGroup):void");
    }
}
