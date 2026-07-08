package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Oor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630910Oor extends FrameLayout {
    public final void setMusic(Music music) {
        C630900Ooq.LIZ.getClass();
        C630900Ooq.LIZJ(this, music);
    }

    public C630910Oor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.dqz, C786410Ut5.ne(context), this);
        View viewFindViewById = findViewById(R.id.ovx);
        if (viewFindViewById != null) {
            int iLIZ = C0HCL.LIZ(16.0f, context);
            viewFindViewById.setPadding(0, iLIZ, 0, iLIZ);
        }
    }
}
