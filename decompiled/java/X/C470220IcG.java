package X;

import Y.ARunnableS107S0100000_7;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.IntProperty;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: renamed from: X.0IcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470220IcG extends AbstractC470040Iby {
    public static final C470240IcI LLJLIL = new IntProperty<View>() { // from class: X.0IcI
        @Override // android.util.Property
        public final Integer get(Object obj) {
            int color;
            ColorDrawable colorDrawable;
            Drawable background = ((View) obj).getBackground();
            if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
                color = colorDrawable.getColor();
            } else {
                color = 0;
            }
            return Integer.valueOf(color);
        }

        @Override // android.util.IntProperty
        public final void setValue(View view, int i) {
            view.setBackgroundColor(i);
        }
    };
    public C21652019oU LLJJJJLIIL;
    public TuxTextView LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public final BPEAHandler LLJJJJJIL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS107S0100000_7 LLJL = new ARunnableS107S0100000_7(this, 285);

    @Override // X.AbstractC470040Iby
    public final int LJIIZILJ() {
        return R.layout.hjs;
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZIZ() {
        super.LIZIZ();
        this.LLJJJJJIL.removeCallbacks(this.LLJL);
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZJ() {
        super.LIZJ();
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLJJJJJIL, this.LLJL);
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZLLL() {
        super.LIZLLL();
        this.LLJJJJJIL.removeCallbacks(this.LLJL);
    }

    @Override // X.AbstractC470040Iby
    public final void LJJ(View view) {
        Object c098200Yq;
        String str;
        List<GoLiveCardPicture> list;
        GoLiveCardPicture goLiveCardPicture;
        Object obj = null;
        try {
            EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
            if (encourageGoLiveCard != null && (list = encourageGoLiveCard.pictures) != null && (goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLL(list)) != null) {
                str = goLiveCardPicture.bgColor;
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
        this.LLJJLIIIJLLLLLLLZ = view;
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LJII(View view, Bundle bundle) {
        ViewGroup viewGroup;
        ViewParent parent;
        C21652019oU c21652019oU;
        String str;
        super.LJII(view, bundle);
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard != null && (viewGroup = this.LLJJIII) != null) {
            this.LLJJJJLIIL = (C21652019oU) viewGroup.findViewById(R.id.rgj);
            TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.tv_title);
            this.LLJJL = tuxTextView;
            if (tuxTextView != null) {
                GoLiveCardPicture goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLL(encourageGoLiveCard.pictures);
                if (goLiveCardPicture != null) {
                    str = goLiveCardPicture.text;
                } else {
                    str = null;
                }
                tuxTextView.setText(str);
            }
            C21652019oU c21652019oU2 = this.LLJJJJLIIL;
            if (c21652019oU2 != null) {
                c21652019oU2.setImgLoadFailedCallback(new AwS586S0100000_7(this, 595));
            }
            if (encourageGoLiveCard.pictures.size() >= 3 && (c21652019oU = this.LLJJJJLIIL) != null) {
                List<GoLiveCardPicture> list = encourageGoLiveCard.pictures;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<GoLiveCardPicture> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().url);
                }
                c21652019oU.setPhotos(arrayList);
            }
            C21652019oU c21652019oU3 = this.LLJJJJLIIL;
            if (c21652019oU3 != null && (parent = c21652019oU3.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            C21652019oU c21652019oU4 = this.LLJJJJLIIL;
            if (c21652019oU4 != null) {
                c21652019oU4.setShowIndexChangeListener(new C470230IcH(this));
            }
        }
    }
}
