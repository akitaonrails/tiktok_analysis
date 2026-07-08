package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979580bbA extends RecyclerView.ViewHolder {
    public final C1324720kZq LL;
    public final C1324720kZq LLILLJJLI;
    public final C16FS LLILLL;
    public final /* synthetic */ C979600bbC LLILZ;

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Integer] */
    public final void L5() {
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        if (C915980Zwa.LJFF().RY(this.LLILZ.LIZLLL).compareTo(EnumC964170bCJ.INVITED) >= 0) {
            c259800zU.element = 2131856762;
            c259800zU2.element = "onClick: teamPairButton is disabled already invited";
        } else if (C948770anT.LJ() && (!C915980Zwa.LJII().LJJIIJZLJL().isEmpty())) {
            c259800zU.element = 2131851852;
            c259800zU2.element = "onClick: teamPairButton is disabled, getSelfHostRoomLinkedGuests().isNotEmpty()";
        } else if (C975140bU0.LJFF()) {
            c259800zU.element = 2131851723;
            c259800zU2.element = "onClick: teamPairButton is disabled, currently in catch beans";
        } else if (C975140bU0.LJII()) {
            c259800zU.element = 2131851724;
            c259800zU2.element = "onClick: teamPairButton is disabled, currently in take the stage";
        }
        if (c259800zU.element == 0 || c259800zU2.element == 0) {
            C16FS c16fs = this.LLILLL;
            if (c16fs != null) {
                c16fs.setEnabled(true);
            }
            C16FS c16fs2 = this.LLILLL;
            if (c16fs2 != null) {
                C786410Ut5.h8(c16fs2, new ACListenerS118S0200000_15(this.LLILZ, this, 60));
                return;
            }
            return;
        }
        C16FS c16fs3 = this.LLILLL;
        if (c16fs3 != null) {
            c16fs3.setEnabled(false);
        }
        C16FS c16fs4 = this.LLILLL;
        if (c16fs4 != null) {
            c16fs4.setAllowClickWhenDisabledCompat(true);
        }
        C16FS c16fs5 = this.LLILLL;
        if (c16fs5 != null) {
            C786410Ut5.h8(c16fs5, new ACListenerS118S0200000_15(c259800zU2, c259800zU, 59));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C979580bbA(C979600bbC c979600bbC, View view) {
        super(view);
        this.LLILZ = c979600bbC;
        this.LL = (C1324720kZq) view.findViewById(R.id.user_avatar_left);
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.user_avatar_right);
        this.LLILLL = (C16FS) view.findViewById(R.id.xfz);
    }

    public static final void I5(ImageModel imageModel, C1324720kZq c1324720kZq) {
        int width;
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
        int height = 0;
        if (c1324720kZq != null) {
            width = c1324720kZq.getWidth();
            height = c1324720kZq.getHeight();
        } else {
            width = 0;
        }
        c1324610kZfLJIIIZ.LJ = width;
        c1324610kZfLJIIIZ.LJFF = height;
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(c1324720kZq);
    }
}
