package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.CoStreamer;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475950IlV extends RecyclerView.ViewHolder {
    public final Function1<CoStreamer, Unit> LL;
    public final Function1<CoStreamer, Unit> LLILLJJLI;
    public final C21569819bE LLILLL;
    public final C1324720kZq LLILZ;
    public final TuxTextView LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C475950IlV(ViewGroup viewGroup, int i, Function1<? super CoStreamer, Unit> function1, Function1<? super CoStreamer, Unit> function12) {
        super(viewGroup);
        this.LL = function1;
        this.LLILLJJLI = function12;
        C21569819bE c21569819bE = (C21569819bE) viewGroup.findViewById(R.id.mts);
        this.LLILLL = c21569819bE;
        this.LLILZ = (C1324720kZq) viewGroup.findViewById(R.id.bir);
        this.LLILZIL = (TuxTextView) viewGroup.findViewById(R.id.dhr);
        if (c21569819bE != null) {
            c21569819bE.LIZJ(EnumC21569519bB.LIVE_TOPLIVE_SKY_LIVING_ICON_NEW);
            c21569819bE.setOuterCircleStrokeWidth(0.0f);
            c21569819bE.setOuterCircleColors(0);
            c21569819bE.LJFF();
        }
        C500260Jjc.LJJZ(C439101nJ.LIZ(80) + i, viewGroup);
        viewGroup.setPadding(viewGroup.getPaddingLeft(), i, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
    }
}
