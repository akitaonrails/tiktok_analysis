package Y;

import X.C1253930ijf;
import X.C1259780it6;
import X.C1479490obT;
import X.C1479500obU;
import X.C1480430ocz;
import X.C1481110oe5;
import X.C1720106oR;
import X.C19MB;
import X.C1C7U;
import X.C2188811AlT;
import X.C297080Bkg;
import X.C418440Gaw;
import X.C419980GdQ;
import X.C420930Gex;
import X.C630120Ona;
import X.C814420VxA;
import android.os.SystemClock;
import android.text.Layout;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoWithArtistAssem;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.zhiliaoapp.musically.R;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS0S1210000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) this.l1;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(this.s0);
            ((OnUIPlayListener) this.l1).onPlayCompleted(this.s0, ((C1479500obU) this.l2).LIZ.LJIILL);
            if (this.z3) {
                ((OnUIPlayListener) this.l1).onLoopPlay(this.s0, ((C1479500obU) this.l2).LIZ.LJIILL);
            }
        }
    }

    public final void LIZ$1() {
        if (((OnUIPlayListener) this.l1) != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((OnUIPlayListener) this.l1).onBuffering(true);
            ((OnUIPlayListener) this.l1).onBuffering(this.s0, true, (C1480430ocz) this.l2);
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBuffering: ");
                sbLIZ.append(this.z3);
                sbLIZ.append(" -> ");
                sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LIZ$2() {
        if (((OnUIPlayListener) this.l1) != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((OnUIPlayListener) this.l1).onBuffering(false);
            ((OnUIPlayListener) this.l1).onBuffering(this.s0, false, (C1480430ocz) this.l2);
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBuffering: ");
                sbLIZ.append(this.z3);
                sbLIZ.append(" -> ");
                sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LIZ$3() {
        int i;
        ConstraintLayout constraintLayout;
        int iAbs;
        int iLIZIZ;
        Layout layout;
        if (this.z3) {
            C419980GdQ c419980GdQ = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJJ;
            if (c419980GdQ != null) {
                c419980GdQ.setFont(92);
            }
            C419980GdQ c419980GdQ2 = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJJ;
            if (c419980GdQ2 != null) {
                c419980GdQ2.setMarginStart(0);
            }
            C630120Ona.LIZIZ(((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJJ);
            C419980GdQ c419980GdQ3 = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJJ;
            if (c419980GdQ3 != null) {
                c419980GdQ3.measure(0, 0);
            }
        } else {
            C630120Ona.LIZ(((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJJ);
        }
        TuxTextView tuxTextView = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJIJIIJIL;
        int iMin = Math.min((tuxTextView == null || (layout = tuxTextView.getLayout()) == null) ? this.s0.length() : layout.getLineEnd(0), this.s0.length());
        MusicPgcMetaInfoWithArtistAssem musicPgcMetaInfoWithArtistAssem = (MusicPgcMetaInfoWithArtistAssem) this.l2;
        TuxTextView tuxTextView2 = musicPgcMetaInfoWithArtistAssem.LLJJIJIIJIL;
        TuxIconView tuxIconView = musicPgcMetaInfoWithArtistAssem.LLJJIII;
        if (tuxTextView2 == null || tuxIconView == null) {
            i = 0;
        } else {
            int iMeasureText = (int) tuxTextView2.getPaint().measureText(tuxTextView2.getText(), 0, tuxTextView2.getText().length());
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            tuxTextView2.getLocationOnScreen(iArr);
            tuxIconView.getLocationOnScreen(iArr2);
            if (C297080Bkg.LIZ() == 4) {
                iAbs = Math.abs(tuxTextView2.getMeasuredWidth() - iMeasureText);
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            } else if (tuxTextView2.getLayoutDirection() == 1) {
                iAbs = Math.abs(tuxTextView2.getMeasuredWidth() - iMeasureText);
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            } else {
                iAbs = Math.abs((iArr[0] + iMeasureText) - iArr2[0]);
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            }
            i = iAbs - iLIZIZ;
        }
        C419980GdQ c419980GdQ4 = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJJ;
        int measuredWidth = c419980GdQ4 != null ? c419980GdQ4.getMeasuredWidth() : 0;
        View view = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJLL;
        int measuredWidth2 = view != null ? view.getMeasuredWidth() : 0;
        TuxTextView tuxTextView3 = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJIJIIJIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C420930Gex.LIZ(0, iMin, this.s0));
        }
        View view2 = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJJJ;
        if (!(view2 instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) view2) == null) {
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        if (iMin < this.s0.length()) {
            TuxTextView tuxTextView4 = ((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJIJIL;
            if (tuxTextView4 != null) {
                String str = this.s0;
                tuxTextView4.setText(str.substring(iMin, str.length()));
            }
            if (this.z3) {
                c19mb.LJIIIIZZ(R.id.tv_pgc_meta_music_second_line, 7, R.id.x1x, 6);
                c19mb.LJIIIIZZ(R.id.x1x, 3, R.id.tv_pgc_meta_music_second_line, 3);
                c19mb.LJIIIIZZ(R.id.x1x, 4, R.id.tv_pgc_meta_music_second_line, 4);
                c19mb.LJIIIIZZ(R.id.x1x, 6, R.id.tv_pgc_meta_music_second_line, 7);
                c19mb.LJIIIIZZ(R.id.x1x, 7, R.id.ou7, 6);
                c19mb.LJIIIIZZ(R.id.ou7, 6, R.id.x1x, 7);
            }
        } else {
            boolean z = this.z3;
            if (z && measuredWidth + measuredWidth2 <= i) {
                c19mb.LJI(R.id.tv_pgc_meta_music, 7);
                c19mb.LJIIIIZZ(R.id.x1x, 3, R.id.tv_pgc_meta_music, 3);
                c19mb.LJIIIIZZ(R.id.x1x, 4, R.id.tv_pgc_meta_music, 4);
                c19mb.LJIIIIZZ(R.id.x1x, 6, R.id.tv_pgc_meta_music, 7);
                c19mb.LJIIIIZZ(R.id.ou7, 6, R.id.x1x, 7);
                c19mb.LJIIIIZZ(R.id.ou7, 3, 0, 3);
            } else if (z) {
                if (measuredWidth <= i) {
                    c19mb.LJI(R.id.tv_pgc_meta_music, 7);
                    c19mb.LJIIIIZZ(R.id.x1x, 3, R.id.tv_pgc_meta_music, 3);
                    c19mb.LJIIIIZZ(R.id.x1x, 4, R.id.tv_pgc_meta_music, 4);
                    c19mb.LJIIIIZZ(R.id.x1x, 6, R.id.tv_pgc_meta_music, 7);
                    c19mb.LJIIIIZZ(R.id.ou7, 6, R.id.tv_pgc_meta_music_prefix, 6);
                } else {
                    c19mb.LJI(R.id.tv_pgc_meta_music, 7);
                    c19mb.LJIIIIZZ(R.id.x1x, 3, R.id.ou7, 3);
                    c19mb.LJIIIIZZ(R.id.x1x, 4, R.id.ou7, 4);
                    c19mb.LJIIIIZZ(R.id.x1x, 6, R.id.tv_pgc_meta_music_prefix, 6);
                    c19mb.LJIIIIZZ(R.id.x1x, 7, R.id.ou7, 6);
                    c19mb.LJIIIIZZ(R.id.ou7, 6, R.id.x1x, 7);
                }
            } else if (measuredWidth2 <= i) {
                c19mb.LJI(R.id.tv_pgc_meta_music, 7);
                c19mb.LJIIIIZZ(R.id.ou7, 6, R.id.tv_pgc_meta_music, 7);
                c19mb.LJIIIIZZ(R.id.ou7, 3, 0, 3);
            } else {
                c19mb.LJI(R.id.tv_pgc_meta_music, 7);
                c19mb.LJIIIIZZ(R.id.ou7, 6, R.id.tv_pgc_meta_music_prefix, 6);
            }
        }
        c19mb.LIZIZ(constraintLayout);
        if (iMin >= this.s0.length()) {
            C630120Ona.LIZ(((MusicPgcMetaInfoWithArtistAssem) this.l2).LLJJIJIL);
        }
    }

    public static final void run$0(ARunnableS0S1210000_9 aRunnableS0S1210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerOnCompletionHelper@5822.onCompletion$2");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS0S1210000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompleted(aRunnableS0S1210000_9.s0);
                ((OnUIPlayListener) aRunnableS0S1210000_9.l1).onPlayCompleted(aRunnableS0S1210000_9.s0, ((C1479490obT) aRunnableS0S1210000_9.l2).LJIILL);
                if (aRunnableS0S1210000_9.z3) {
                    ((OnUIPlayListener) aRunnableS0S1210000_9.l1).onLoopPlay(aRunnableS0S1210000_9.s0, ((C1479490obT) aRunnableS0S1210000_9.l2).LJIILL);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerOnCompletionHelper@5822.onCompletion$2");
    }

    public static final void run$1(ARunnableS0S1210000_9 aRunnableS0S1210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onCompletion$2");
        try {
            aRunnableS0S1210000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onCompletion$2");
    }

    public static final void run$2(ARunnableS0S1210000_9 aRunnableS0S1210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerOnBufferHelper@4bf1.onBuffering$1");
        try {
            aRunnableS0S1210000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerOnBufferHelper@4bf1.onBuffering$1");
    }

    public static final void run$3(ARunnableS0S1210000_9 aRunnableS0S1210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerOnBufferHelper@4bf1.onBuffering$2");
        try {
            aRunnableS0S1210000_9.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerOnBufferHelper@4bf1.onBuffering$2");
    }

    public static final void run$4(ARunnableS0S1210000_9 aRunnableS0S1210000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MusicPgcMetaInfoWithArtistAssem@56f5.bindMusicInfo$$inlined$doOnPreDraw$1");
        try {
            aRunnableS0S1210000_9.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicPgcMetaInfoWithArtistAssem@56f5.bindMusicInfo$$inlined$doOnPreDraw$1");
    }

    public static final void run$5(ARunnableS0S1210000_9 aRunnableS0S1210000_9) {
        String requestId;
        UrlModel cover;
        UrlModel cover2;
        C1259780it6 c1259780it6 = (C1259780it6) aRunnableS0S1210000_9.l1;
        boolean z = aRunnableS0S1210000_9.z3;
        String str = aRunnableS0S1210000_9.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1210000_9.l2;
        c1259780it6.getClass();
        C1C7U.LIZ("AwemeViewHolder@8d38.reportImageLoadStatus$1L");
        long jCurrentTimeMillis = System.currentTimeMillis() - c1259780it6.LLLIIIL;
        List<String> urlList = null;
        String aid = null;
        urlList = null;
        if (!z) {
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            Video video = c1259780it6.LLJZIJLIL;
            if (video != null) {
                cover2 = video.getCover();
            } else {
                cover2 = null;
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            Boolean boolValueOf = Boolean.valueOf(c1259780it6.LLJLILLLLZIIL);
            Video video2 = c1259780it6.LLJZIJLIL;
            if (video2 != null) {
                aid = video2.getAid();
            }
            c1253930ijf.getClass();
            C1253930ijf.LJJI("video_cover_load_failed", cover2, str, jSONObject, lValueOf, boolValueOf, aid);
        } else {
            Video video3 = c1259780it6.LLJZIJLIL;
            if (video3 != null && (cover = video3.getCover()) != null) {
                urlList = cover.getUrlList();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tag: video_cover_load_success, urlList: ");
            sbLIZ.append(urlList);
            sbLIZ.append(", requestId: ");
            Aweme aweme = c1259780it6.LL;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = "";
            }
            sbLIZ.append(requestId);
            sbLIZ.append(", duration: ");
            sbLIZ.append(jCurrentTimeMillis);
            C1720106oR.LJI("profile.PostCover", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("AwemeViewHolder@8d38.reportImageLoadStatus$1L");
    }

    public ARunnableS0S1210000_9(Object obj, boolean z, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.z3 = z;
        this.l2 = obj2;
        this.s0 = str;
    }
}
