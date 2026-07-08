package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.zhiliaoapp.musically.R;
import irm.AkS62S0200000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import u4.q0;

/* JADX INFO: renamed from: X.0snc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640780snc extends RecyclerView.ViewHolder {
    public StickerSetCategory LL;
    public EnumC1641420soe LLILLJJLI;
    public int LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final TuxTextView LLILZLL;
    public final C1324800kZy LLIZ;
    public final C1324800kZy LLIZLLLIL;
    public final int LLJ;

    public C1640780snc(View view, AwS674S0100000_25 awS674S0100000_25) {
        super(view);
        this.LLILLJJLI = EnumC1641420soe.NOT_DOWNLOAD;
        this.LLILZ = "creation";
        this.LLILZIL = "sticker_list_panel";
        int iLIZIZ = (int) (((double) ((C497820Jfg.LIZIZ(view.getContext()) - C11VU.LIZ(46.0f)) / 3)) * 0.48d);
        this.LLJ = iLIZIZ;
        int iLJII = ((C11VU.LJII(r7 - iLIZIZ, view.getContext()) - 32) - 18) + 8;
        int i = iLJII + 24;
        C786410Ut5.I7(new AkS62S0200000_25(this, awS674S0100000_25, 0), view);
        q0.LJIJ(view, new C786390Ut3(6));
        C426750GoL.LJIIIZ(view.findViewById(R.id.w78), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJII)))), false, 23);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.w79);
        C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(4));
        C1324800kZy c1324800kZy = (C1324800kZy) view.findViewById(R.id.w76);
        c1324800kZy.getHierarchy().LJJIII(c1331100kk8LIZLLL);
        c1324800kZy.getLayoutParams().width = iLIZIZ;
        c1324800kZy.getLayoutParams().height = iLIZIZ;
        C426750GoL.LJIIIZ(c1324800kZy, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), false, 23);
        this.LLIZ = c1324800kZy;
        C1324800kZy c1324800kZy2 = (C1324800kZy) view.findViewById(R.id.w77);
        c1324800kZy2.getHierarchy().LJJIII(c1331100kk8LIZLLL);
        c1324800kZy2.getLayoutParams().width = iLIZIZ;
        c1324800kZy2.getLayoutParams().height = iLIZIZ;
        C426750GoL.LJIIIZ(c1324800kZy2, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), false, 23);
        this.LLIZLLLIL = c1324800kZy2;
    }
}
