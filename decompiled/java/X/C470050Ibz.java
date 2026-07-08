package X;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: renamed from: X.0Ibz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470050Ibz extends AbstractC470040Iby {
    public ImageView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public ImageView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public ImageView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public ImageView LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public ViewTreeObserverOnGlobalLayoutListenerC521810KdH LLJZIJLIL;

    @Override // X.AbstractC470040Iby
    public final int LJIIZILJ() {
        return R.layout.hjx;
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZIZ() {
        super.LIZIZ();
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
    }

    @Override // X.AbstractC470040Iby
    public final void LJJ(View view) {
        Object c098200Yq;
        String str;
        Object obj = null;
        try {
            EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
            if (encourageGoLiveCard != null) {
                str = encourageGoLiveCard.videoBgColor;
            } else {
                str = null;
            }
            c098200Yq = Integer.valueOf(Color.parseColor(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LJII(View view, Bundle bundle) {
        ImageView imageView;
        TuxTextView tuxTextView;
        ImageView imageView2;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        ImageView imageView3;
        TuxTextView tuxTextView4;
        TuxTextView tuxTextView5;
        ImageView imageView4;
        TuxTextView tuxTextView6;
        TuxTextView tuxTextView7;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.LJII(view, bundle);
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return;
        }
        ViewGroup viewGroup = this.LLJJIII;
        String str9 = null;
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R.id.jx7);
        } else {
            imageView = null;
        }
        this.LLJJJJJIL = imageView;
        ViewGroup viewGroup2 = this.LLJJIII;
        if (viewGroup2 != null) {
            tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.tv_title);
        } else {
            tuxTextView = null;
        }
        this.LLJJJJLIIL = tuxTextView;
        ViewGroup viewGroup3 = this.LLJJIII;
        if (viewGroup3 != null) {
            imageView2 = (ImageView) viewGroup3.findViewById(R.id.lkx);
        } else {
            imageView2 = null;
        }
        this.LLJJL = imageView2;
        ViewGroup viewGroup4 = this.LLJJIII;
        if (viewGroup4 != null) {
            tuxTextView2 = (TuxTextView) viewGroup4.findViewById(R.id.zf1);
        } else {
            tuxTextView2 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = tuxTextView2;
        ViewGroup viewGroup5 = this.LLJJIII;
        if (viewGroup5 != null) {
            tuxTextView3 = (TuxTextView) viewGroup5.findViewById(R.id.tv_sub_content1);
        } else {
            tuxTextView3 = null;
        }
        this.LLJL = tuxTextView3;
        ViewGroup viewGroup6 = this.LLJJIII;
        if (viewGroup6 != null) {
            imageView3 = (ImageView) viewGroup6.findViewById(R.id.lky);
        } else {
            imageView3 = null;
        }
        this.LLJLIL = imageView3;
        ViewGroup viewGroup7 = this.LLJJIII;
        if (viewGroup7 != null) {
            tuxTextView4 = (TuxTextView) viewGroup7.findViewById(R.id.zf2);
        } else {
            tuxTextView4 = null;
        }
        this.LLJLILLLLZIIL = tuxTextView4;
        ViewGroup viewGroup8 = this.LLJJIII;
        if (viewGroup8 != null) {
            tuxTextView5 = (TuxTextView) viewGroup8.findViewById(R.id.tv_sub_content2);
        } else {
            tuxTextView5 = null;
        }
        this.LLJLL = tuxTextView5;
        ViewGroup viewGroup9 = this.LLJJIII;
        if (viewGroup9 != null) {
            imageView4 = (ImageView) viewGroup9.findViewById(R.id.lkz);
        } else {
            imageView4 = null;
        }
        this.LLJLLIL = imageView4;
        ViewGroup viewGroup10 = this.LLJJIII;
        if (viewGroup10 != null) {
            tuxTextView6 = (TuxTextView) viewGroup10.findViewById(R.id.zf3);
        } else {
            tuxTextView6 = null;
        }
        this.LLJLLL = tuxTextView6;
        ViewGroup viewGroup11 = this.LLJJIII;
        if (viewGroup11 != null) {
            tuxTextView7 = (TuxTextView) viewGroup11.findViewById(R.id.tv_sub_content3);
        } else {
            tuxTextView7 = null;
        }
        this.LLJZ = tuxTextView7;
        ViewGroup viewGroup12 = this.LLJJIII;
        if (viewGroup12 != null) {
            viewGroup12.setBackground(null);
            ViewGroup.LayoutParams layoutParams = viewGroup12.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(32.0f));
                    marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(32.0f));
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.X5(marginLayoutParams, viewGroup12);
        }
        TuxTextView tuxTextView8 = this.LLJJJJLIIL;
        if (tuxTextView8 != null) {
            tuxTextView8.setText(encourageGoLiveCard.title);
        }
        LJIJJ(encourageGoLiveCard.titleIconUrl, this.LLJJJJJIL, null);
        GoLiveCardPicture goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLZIJ(0, encourageGoLiveCard.pictures);
        if (goLiveCardPicture != null) {
            str = goLiveCardPicture.url;
        } else {
            str = null;
        }
        LJIJJ(str, this.LLJJL, null);
        TuxTextView tuxTextView9 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView9 != null) {
            GoLiveCardPicture goLiveCardPicture2 = (GoLiveCardPicture) C13LP.LJJJLZIJ(0, encourageGoLiveCard.pictures);
            if (goLiveCardPicture2 != null) {
                str8 = goLiveCardPicture2.text;
            } else {
                str8 = null;
            }
            tuxTextView9.setText(str8);
        }
        TuxTextView tuxTextView10 = this.LLJL;
        if (tuxTextView10 != null) {
            GoLiveCardPicture goLiveCardPicture3 = (GoLiveCardPicture) C13LP.LJJJLZIJ(0, encourageGoLiveCard.pictures);
            if (goLiveCardPicture3 != null) {
                str7 = goLiveCardPicture3.subText;
            } else {
                str7 = null;
            }
            tuxTextView10.setText(str7);
        }
        GoLiveCardPicture goLiveCardPicture4 = (GoLiveCardPicture) C13LP.LJJJLZIJ(1, encourageGoLiveCard.pictures);
        if (goLiveCardPicture4 != null) {
            str2 = goLiveCardPicture4.url;
        } else {
            str2 = null;
        }
        LJIJJ(str2, this.LLJLIL, null);
        TuxTextView tuxTextView11 = this.LLJLILLLLZIIL;
        if (tuxTextView11 != null) {
            GoLiveCardPicture goLiveCardPicture5 = (GoLiveCardPicture) C13LP.LJJJLZIJ(1, encourageGoLiveCard.pictures);
            if (goLiveCardPicture5 != null) {
                str6 = goLiveCardPicture5.text;
            } else {
                str6 = null;
            }
            tuxTextView11.setText(str6);
        }
        TuxTextView tuxTextView12 = this.LLJLL;
        if (tuxTextView12 != null) {
            GoLiveCardPicture goLiveCardPicture6 = (GoLiveCardPicture) C13LP.LJJJLZIJ(1, encourageGoLiveCard.pictures);
            if (goLiveCardPicture6 != null) {
                str5 = goLiveCardPicture6.subText;
            } else {
                str5 = null;
            }
            tuxTextView12.setText(str5);
        }
        GoLiveCardPicture goLiveCardPicture7 = (GoLiveCardPicture) C13LP.LJJJLZIJ(2, encourageGoLiveCard.pictures);
        if (goLiveCardPicture7 != null) {
            str3 = goLiveCardPicture7.url;
        } else {
            str3 = null;
        }
        LJIJJ(str3, this.LLJLLIL, null);
        TuxTextView tuxTextView13 = this.LLJLLL;
        if (tuxTextView13 != null) {
            GoLiveCardPicture goLiveCardPicture8 = (GoLiveCardPicture) C13LP.LJJJLZIJ(2, encourageGoLiveCard.pictures);
            if (goLiveCardPicture8 != null) {
                str4 = goLiveCardPicture8.text;
            } else {
                str4 = null;
            }
            tuxTextView13.setText(str4);
        }
        TuxTextView tuxTextView14 = this.LLJZ;
        if (tuxTextView14 != null) {
            GoLiveCardPicture goLiveCardPicture9 = (GoLiveCardPicture) C13LP.LJJJLZIJ(2, encourageGoLiveCard.pictures);
            if (goLiveCardPicture9 != null) {
                str9 = goLiveCardPicture9.subText;
            }
            tuxTextView14.setText(str9);
        }
        this.LLJZIJLIL = new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(view, this, 8);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH = this.LLJZIJLIL;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521810KdH);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521810KdH, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }
}
