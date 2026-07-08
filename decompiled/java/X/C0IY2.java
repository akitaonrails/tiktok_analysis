package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0IY2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0IY2 extends AbstractC468490IYt<FeedItem> {
    public final String LLILLL;
    public final C11RK<FeedItem> LLILZ;
    public final C11RK<Boolean> LLILZIL;
    public final ViewGroup LLILZLL;
    public final C469770IbX LLIZ;
    public TextView LLIZLLLIL;
    public C1324720kZq LLJ;
    public TextView LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public C16F5 LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public C1324720kZq LLJJIII;
    public C1324720kZq LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C0IY7 LLJJIJIL;
    public Room LLJJJ;
    public FeedItem LLJJJIL;
    public int LLJJJJ;
    public DrawerSmallLiveViewHolder.LogExtraData LLJJJJJIL;
    public DrawerSmallLiveViewHolder.LogExtraData LLJJJJLIIL;
    public int LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    @Override // X.AbstractC468490IYt
    public final void onViewAttachedToWindow() {
        this.LL = true;
        if (this.LLJJLIIIJLLLLLLLZ) {
            int i = this.LLJJL;
            if (i == 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewAttachedToWindow room");
                Room room = this.LLJJJ;
                sbLIZ.append(room != null ? Long.valueOf(room.getId()) : null);
                C20441214yg.LIZIZ("onViewAttachedToWindow", C2188811AlT.LIZIZ(sbLIZ));
                U5(this.LLJJJ);
            } else if (i == 0) {
                C467800IWc c467800IWc = C467800IWc.LJIJ;
                String str = c467800IWc.LJIIIIZZ;
                if (str == null) {
                    str = "";
                }
                boolean z = c467800IWc.LIZIZ().length() == 0;
                C469770IbX c469770IbX = this.LLIZ;
                if (TextUtils.equals(str, c469770IbX != null ? c469770IbX.LIZ : null)) {
                    U5(this.LLJJJ);
                } else if (!this.LLJL && !z) {
                    U5(this.LLJJJ);
                    this.LLJL = true;
                }
            }
            C467800IWc c467800IWc2 = C467800IWc.LJIJ;
            FeedItem feedItem = this.LLJJJIL;
            if (feedItem == null) {
                return;
            }
            ((HashSet) c467800IWc2.LJIIZILJ.getValue()).remove(feedItem);
        }
    }

    public void R5() {
        this.LLIZLLLIL = (TextView) this.itemView.findViewById(R.id.title);
        this.LLJ = (C1324720kZq) this.itemView.findViewById(R.id.mvv);
        this.LLJI = (TextView) this.itemView.findViewById(R.id.b_x);
        this.LLJIJIL = this.itemView.findViewById(R.id.o1m);
        this.LLJILJIL = this.itemView.findViewById(R.id.o12);
        this.LLJILJILJ = this.itemView.findViewById(R.id.mjh);
        this.itemView.findViewById(R.id.mjj);
        this.itemView.findViewById(R.id.mji);
        this.LLJJI = this.itemView.findViewById(R.id.mlg);
        this.LLJJ = this.itemView.findViewById(R.id.mle);
        this.LLJJIII = (C1324720kZq) this.itemView.findViewById(R.id.mlh);
        this.LLJJIJI = (C1324720kZq) this.itemView.findViewById(R.id.mlf);
        this.LLJJIJIIJIL = (C16F5) this.itemView.findViewById(R.id.mli);
        this.LLJILLL = (C16F5) this.itemView.findViewById(R.id.pvi);
    }

    public void T5(FeedItem feedItem) {
        String str;
        C0IUA.LJJII = this.LLJJJJ;
        C0IVW c0ivw = new C0IVW(this.itemView.getContext(), feedItem);
        c0ivw.LJFF = this.LLILLL;
        c0ivw.LJI = getAdapterPosition();
        c0ivw.LJII = this.LLJJJJ;
        C469770IbX c469770IbX = this.LLIZ;
        if (c469770IbX != null) {
            str = c469770IbX.LIZ;
        } else {
            str = null;
        }
        c0ivw.LJIIIIZZ = str;
        c0ivw.LJIIIZ = this.LLILZ;
        c0ivw.LJIIJ = this.LLJJJJJIL;
        c0ivw.LJIIJJI = this.LLJJJJLIIL;
        C0IVV.LIZIZ(c0ivw);
    }

    public final void U5(Room room) {
        String str;
        C0IVW c0ivw = new C0IVW(this.itemView.getContext(), this.LLJJJIL);
        c0ivw.LJ = room;
        c0ivw.LJI = getAdapterPosition();
        c0ivw.LJII = this.LLJJJJ;
        c0ivw.LJIIJ = this.LLJJJJJIL;
        c0ivw.LJIIJJI = this.LLJJJJLIIL;
        c0ivw.LJIIZILJ = "live_cell";
        C469770IbX c469770IbX = this.LLIZ;
        if (c469770IbX != null) {
            str = c469770IbX.LIZ;
        } else {
            str = null;
        }
        c0ivw.LJIIIIZZ = str;
        C0IVV.LIZJ(c0ivw);
    }

    public static final void S5(ImageModel imageModel, C1324720kZq c1324720kZq) {
        if (imageModel != null && !C0IKQ.LIZ(imageModel.getUrls())) {
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
            }
            C1324570kZb.LIZJ(c1324720kZq, imageModel, null, null, new C522060Kdg(c1324720kZq, 3), imageModel.isAnimated());
            return;
        }
        if (c1324720kZq == null) {
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 8);
    }

    public static final void W5(C16F5 c16f5, Text text) {
        String strLIZIZ;
        if (c16f5 != null && text != null) {
            String str = text.defaultPattern;
            if (!TextUtils.isEmpty(text.key)) {
                C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                String str2 = text.key;
                c1124870fNVLIZJ.getClass();
                strLIZIZ = C1124870fNV.LIZIZ(str2);
            } else {
                strLIZIZ = null;
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                str = strLIZIZ;
            }
            c16f5.setText(C1133830fbx.LJIILJJIL(str, text, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173  */
    @Override // X.AbstractC468490IYt
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I5(int r13, com.bytedance.android.livesdk.model.FeedItem r14) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IY2.I5(int, com.bytedance.android.livesdk.model.FeedItem):void");
    }

    public void V5(int i, int i2) {
        int i3;
        ViewGroup.LayoutParams layoutParams;
        int measuredWidth = (this.LLILZLL.getMeasuredWidth() - 3) / 2;
        if (i > 0 && i2 > 0) {
            i3 = (i2 * measuredWidth) / i;
        } else {
            i3 = measuredWidth;
        }
        C1324720kZq c1324720kZq = this.LLJ;
        if (c1324720kZq != null) {
            layoutParams = c1324720kZq.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == measuredWidth && layoutParams.height == i3) {
                    return;
                }
                layoutParams.width = measuredWidth;
                layoutParams.height = i3;
            }
        } else {
            layoutParams = null;
        }
        C1324720kZq c1324720kZq2 = this.LLJ;
        if (c1324720kZq2 != null) {
            C786410Ut5.u6(c1324720kZq2, layoutParams);
        }
    }

    public C0IY2(View view, String str, C11RK<FeedItem> c11rk, C11RK<Boolean> c11rk2, ViewGroup viewGroup, C469770IbX c469770IbX) {
        super(view);
        this.LLILLL = str;
        this.LLILZ = c11rk;
        this.LLILZIL = c11rk2;
        this.LLILZLL = viewGroup;
        this.LLIZ = c469770IbX;
        this.LLJJJJ = -1;
        this.LLJJLIIIJLLLLLLLZ = true;
        R5();
    }
}
