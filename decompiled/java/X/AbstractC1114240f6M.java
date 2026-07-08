package X;

import android.graphics.Rect;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import emotes.util.FanClubEmotePanelSpanCountSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0f6M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1114240f6M extends RecyclerView.ViewHolder {
    public final C1110180ezo LL;
    public final List<EmoteModel> LLILLJJLI;
    public final C1117360fBO LLILLL;
    public boolean LLILZ;
    public EmoteModel LLILZIL;

    public abstract int I5();

    public void onBind() {
        final int iLJIIZILJ;
        C1110180ezo c1110180ezo = this.LL;
        final int i = !c1110180ezo.LLILZ ? 9 : (c1110180ezo.LLILZIL || FanClubEmotePanelSpanCountSetting.INSTANCE.getValue()) ? 4 : 5;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.t0q);
        recyclerView.setItemViewCacheSize(36);
        final int i2 = 0;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.itemView.getContext(), 0);
        flexboxLayoutManager.LJJII(1);
        flexboxLayoutManager.LJJIFFI(0);
        flexboxLayoutManager.LJJI(0);
        flexboxLayoutManager.LJJIII(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        if (i == 4) {
            final int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
            recyclerView.addItemDecoration(new C0DXR(iLIZIZ, i) { // from class: X.06XD
                public final int LL;
                public final int LLILLJJLI;

                {
                    this.LL = iLIZIZ;
                    this.LLILLJJLI = i;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int i3 = this.LL / 2;
                    rect.top = i3;
                    rect.bottom = i3;
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                    int i4 = this.LLILLJJLI;
                    if (childAdapterPosition % i4 < i4 - 1) {
                        rect.right = this.LL;
                    } else {
                        rect.right = 0;
                    }
                    if (c21673919s1.LIZIZ() > 0 && this.LLILLJJLI > 0) {
                        int iLIZIZ2 = c21673919s1.LIZIZ();
                        int iLIZIZ3 = c21673919s1.LIZIZ();
                        int iLIZIZ4 = this.LLILLJJLI;
                        if (iLIZIZ3 % iLIZIZ4 != 0) {
                            iLIZIZ4 = c21673919s1.LIZIZ() % this.LLILLJJLI;
                        }
                        if (childAdapterPosition >= iLIZIZ2 - iLIZIZ4) {
                            rect.bottom = (int) C497740JfY.LIZIZ(70.0f);
                        }
                    }
                }
            });
            recyclerView.setPadding((int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(8.0f), (int) C497740JfY.LIZIZ(16.0f), 0);
            iLJIIZILJ = ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ((3 * 16.0f) + 32.0f))) / i) - 1;
        } else {
            recyclerView.addItemDecoration(new C0DXR(i2, i) { // from class: X.06XD
                public final int LL;
                public final int LLILLJJLI;

                {
                    this.LL = i2;
                    this.LLILLJJLI = i;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int i3 = this.LL / 2;
                    rect.top = i3;
                    rect.bottom = i3;
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                    int i4 = this.LLILLJJLI;
                    if (childAdapterPosition % i4 < i4 - 1) {
                        rect.right = this.LL;
                    } else {
                        rect.right = 0;
                    }
                    if (c21673919s1.LIZIZ() > 0 && this.LLILLJJLI > 0) {
                        int iLIZIZ2 = c21673919s1.LIZIZ();
                        int iLIZIZ3 = c21673919s1.LIZIZ();
                        int iLIZIZ4 = this.LLILLJJLI;
                        if (iLIZIZ3 % iLIZIZ4 != 0) {
                            iLIZIZ4 = c21673919s1.LIZIZ() % this.LLILLJJLI;
                        }
                        if (childAdapterPosition >= iLIZIZ2 - iLIZIZ4) {
                            rect.bottom = (int) C497740JfY.LIZIZ(70.0f);
                        }
                    }
                }
            });
            recyclerView.setPadding((int) C497740JfY.LIZIZ(8.0f), (int) C497740JfY.LIZIZ(8.0f), (int) C497740JfY.LIZIZ(8.0f), 0);
            iLJIIZILJ = (C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(8.0f)) * 2)) / i;
        }
        recyclerView.setAdapter(this.LLILLL);
        C1117360fBO c1117360fBO = this.LLILLL;
        final C1110180ezo c1110180ezo2 = this.LL;
        final AFwS205S0000000_17 aFwS205S0000000_17 = AFwS205S0000000_17.get$arr$(265);
        c1117360fBO.LLLI(EmoteModel.class, new AbstractC1115610f8Z<EmoteModel, C1115580f8W>(iLJIIZILJ, c1110180ezo2, aFwS205S0000000_17) { // from class: X.0f6Q
            public final int LIZIZ;
            public final InterfaceC1115480f8M<EmoteModel> LIZJ;
            public final InterfaceC1115630f8b LIZLLL = null;
            public final String LJ = "live_room_sub_emote_input_page";
            public final Function0<Boolean> LJFF;

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                C1115580f8W c1115580f8W = new C1115580f8W(C786410Ut5.Td(layoutInflater, R.layout.gt7, viewGroup, false), this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
                ViewGroup.LayoutParams layoutParams = c1115580f8W.itemView.getLayoutParams();
                int i3 = this.LIZIZ;
                layoutParams.height = i3;
                layoutParams.width = i3;
                C786410Ut5.W5(c1115580f8W.itemView, layoutParams);
                return c1115580f8W;
            }

            {
                this.LIZIZ = iLJIIZILJ;
                this.LIZJ = c1110180ezo2;
                this.LJFF = aFwS205S0000000_17;
            }
        });
        this.LLILLL.LL = this.LLILLJJLI;
        if (this.LLILZ) {
            this.LLILZ = false;
            EmoteModel emoteModel = this.LLILZIL;
            if (emoteModel != null) {
                L5(emoteModel);
            }
        }
    }

    public final void L5(EmoteModel emoteModel) {
        if (C1533950q1J.LJ(emoteModel.emoteId)) {
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.t0q);
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter == null) {
                this.LLILZ = true;
                this.LLILZIL = emoteModel;
                return;
            }
            C1117360fBO c1117360fBO = (C1117360fBO) adapter;
            List<?> list = c1117360fBO.LL;
            if (C500260Jjc.LJJIJIIJI(list)) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                int i2 = -1;
                for (Object obj : list) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        if (obj instanceof EmoteModel) {
                            EmoteModel emoteModel2 = (EmoteModel) obj;
                            if (Intrinsics.LJFF(emoteModel2.emoteId, emoteModel.emoteId)) {
                                emoteModel2.shine = true;
                                arrayList.add(obj);
                                i2 = i;
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        i = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                c1117360fBO.LLLII(arrayList);
                c1117360fBO.notifyDataSetChanged();
                if (i2 > -1) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1114240f6M(C1110180ezo c1110180ezo, List<? extends EmoteModel> list, View view) {
        super(view);
        this.LL = c1110180ezo;
        this.LLILLJJLI = list;
        this.LLILLL = new C1117360fBO();
    }

    public final void N5(C16F5 c16f5, String str, String str2) {
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        int length = str2.length() + iLJJJ;
        if (iLJJJ != -1 && length != -1) {
            SpannableString spannableString = new SpannableString(str);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZJ(R.attr.f00, this.itemView)), iLJJJ, length, 33);
            c16f5.setText(spannableString);
            return;
        }
        c16f5.setText(str);
    }
}
