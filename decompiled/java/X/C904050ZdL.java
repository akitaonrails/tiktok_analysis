package X;

import android.animation.Animator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904050ZdL extends FrameLayout {
    public Animator LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final FrameLayout LLILZ;
    public boolean LLILZIL;
    public Animator LLILZLL;

    public C904050ZdL(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.ckk, this);
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.nel);
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.auk);
        this.LLILLL = (TuxTextView) findViewById(R.id.sti);
        this.LLILZ = (FrameLayout) findViewById(R.id.auj);
        viewGroup.setBackground(C426210GnT.LIZ(context));
        viewGroup.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
    }
}
