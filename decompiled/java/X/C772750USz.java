package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.game.broadcast.speeddetector.GamePreparationDefinitionDialog;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0USz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772750USz extends RecyclerView.ViewHolder {
    public final ConstraintLayout LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C20744016Fi LLILZIL;
    public final /* synthetic */ GamePreparationDefinitionDialog LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C772750USz(GamePreparationDefinitionDialog gamePreparationDefinitionDialog, View view) {
        super(view);
        this.LLILZLL = gamePreparationDefinitionDialog;
        this.LL = (ConstraintLayout) view.findViewById(R.id.dvx);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.zhk);
        this.LLILLL = (C16F5) view.findViewById(R.id.zhj);
        this.LLILZ = (C16F5) view.findViewById(R.id.zhl);
        this.LLILZIL = (C20744016Fi) view.findViewById(R.id.sp8);
    }
}
