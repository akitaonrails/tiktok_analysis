package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS608S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19615711op extends AbstractC19588311kP<MusicStickerModel> {
    public C1664680tQA<MusicStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public Function0<Unit> LLIZ;
    public ImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C1295960jpS LLJIJIL;
    public View LLJILJIL;
    public final C01GW LLJILJILJ;

    public final void LIZIZ() {
        C1664680tQA<MusicStickerModel> c1664680tQA = this.LLILZIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11oq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((MusicStickerModel) obj).getVisible());
            }
        });
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 669));
        C1664680tQA<MusicStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA2.LIZ(new C2217381BqS() { // from class: X.11or
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((MusicStickerModel) obj).getCover();
            }
        });
        LifecycleOwner lifecycleOwner2 = this.LLILZLL;
        if (lifecycleOwner2 == null) {
            lifecycleOwner2 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 656));
        C1664680tQA<MusicStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA3.LIZ(new C2217381BqS() { // from class: X.11os
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((MusicStickerModel) obj).getTitle();
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLILZLL;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 657));
        C1664680tQA<MusicStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA4.LIZ(new C2217381BqS() { // from class: X.11ot
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((MusicStickerModel) obj).getArtistName();
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLILZLL;
        liveStateLIZ4.LJIIIZ(lifecycleOwner4 != null ? lifecycleOwner4 : null, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 658));
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 223);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final TuxTextView getArtistName() {
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final ImageView getCover() {
        ImageView imageView = this.LLIZLLLIL;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    public final TuxTextView getSongName() {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final InterfaceC19578611iq getStickerClickListener() {
        return (InterfaceC19578611iq) this.LLJILJILJ.getValue();
    }

    @Override // android.view.View
    public final C1295960jpS getAnimation() {
        return this.LLJIJIL;
    }

    public final View getWrapper() {
        return this.LLJILJIL;
    }

    public final void LIZLLL(int i) {
        int i2;
        C786410Ut5.LJJJJI(this);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        if (i == 2) {
            i2 = R.layout.drm;
        } else {
            i2 = R.layout.drl;
        }
        C786410Ut5.Sd(i2, layoutInflaterNe, this);
        if (i == 2) {
            this.LLJIJIL = (C1295960jpS) findViewById(R.id.owp);
            this.LLJILJIL = findViewById(R.id.ows);
        } else {
            this.LLJIJIL = null;
            this.LLJILJIL = null;
        }
        ImageView imageView = (ImageView) findViewById(R.id.owo);
        imageView.setClipToOutline(true);
        if (i == 2) {
            imageView.setOutlineProvider(new C1151470g4P(1));
        }
        setCover(imageView);
        setSongName((TuxTextView) findViewById(R.id.owq));
        setArtistName((TuxTextView) findViewById(R.id.owm));
    }

    public final void LJ(UrlModel urlModel) {
        String uri;
        List<String> urlList;
        if (urlModel == null || (((urlList = urlModel.getUrlList()) == null || (uri = (String) C13LP.LJJJLL(urlList)) == null) && (uri = urlModel.getUri()) == null)) {
            uri = "";
        }
        C1331660kl2.LJIIIZ(uri).LJJII(new C19772512Xr(this, 5));
    }

    public final void setAnimation(C1295960jpS c1295960jpS) {
        this.LLJIJIL = c1295960jpS;
    }

    public final void setArtistName(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setCover(ImageView imageView) {
        this.LLIZLLLIL = imageView;
    }

    public final void setSongName(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setWrapper(View view) {
        this.LLJILJIL = view;
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        int i;
        this.LLILZ = interactStickerStruct;
        MusicStickerStruct musicStickerStruct = interactStickerStruct.getMusicStickerStruct();
        if (musicStickerStruct != null) {
            i = musicStickerStruct.stickerStyle;
        } else {
            i = 1;
        }
        LIZLLL(i);
        MusicStickerStruct musicStickerStruct2 = interactStickerStruct.getMusicStickerStruct();
        if (musicStickerStruct2 != null) {
            UrlModel urlModel = musicStickerStruct2.cover;
            if (urlModel != null) {
                LJ(urlModel);
            }
            String str = musicStickerStruct2.title;
            if (str != null) {
                TuxTextView songName = getSongName();
                if (songName != null) {
                    songName.setText(str);
                }
                TuxTextView songName2 = getSongName();
                if (songName2 != null) {
                    songName2.setSelected(true);
                }
            }
            String str2 = musicStickerStruct2.artistName;
            if (str2 != null) {
                TuxTextView artistName = getArtistName();
                if (artistName != null) {
                    artistName.setText(str2);
                }
                TuxTextView artistName2 = getArtistName();
                if (artistName2 != null) {
                    artistName2.setSelected(true);
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19615711op(int i, Context context, C19591211ks c19591211ks) {
        c19591211ks = (i & 8) != 0 ? null : c19591211ks;
        super(0, context, (AttributeSet) null, c19591211ks);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(c19591211ks, 793));
    }
}
