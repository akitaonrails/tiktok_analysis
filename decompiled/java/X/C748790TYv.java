package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS694S0100000_12;

/* JADX INFO: renamed from: X.0TYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748790TYv extends FrameLayout implements InterfaceC748810TYx {
    public LiveEditText LL;
    public LiveIconView LLILLJJLI;
    public C16FS LLILLL;
    public C16FS LLILZ;
    public RecyclerView LLILZIL;
    public LinearLayout LLILZLL;
    public C16F5 LLIZ;
    public LinearLayout LLIZLLLIL;
    public ConstraintLayout LLJ;
    public LinearLayout LLJI;
    public boolean LLJIJIL;
    public final C748800TYw LLJILJIL;
    public C748760TYs LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public Function1<? super Integer, Unit> LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public DataChannel LLJJIJIL;

    @Override // X.InterfaceC748810TYx
    public final void LIZJ() {
    }

    @Override // X.InterfaceC748810TYx
    public final void LJ() {
        this.LLJJIJIIJIL = true;
    }

    @Override // X.InterfaceC748810TYx
    public final void LJFF(Throwable th) {
    }

    public final void getBlockWords() {
        Pair pair;
        if (Intrinsics.LJFF(this.LLJJIJI, "live_take_page")) {
            this.LLJILJIL.LIZJ();
            return;
        }
        DataChannel dataChannel = this.LLJJIJIL;
        if (dataChannel == null || (pair = (Pair) dataChannel.gg0(C0TZA.class)) == null) {
            this.LLJILJIL.LIZJ();
            return;
        }
        LIZLLL((List) pair.getFirst(), ((BlockWordGetExtra) pair.getSecond()).maxCount, ((BlockWordGetExtra) pair.getSecond()).maxLength);
        C760160Trq c760160TrqLIZJ = C759970TrX.LIZJ("ttlive_fetch_sensitive_word");
        c760160TrqLIZJ.LIZIZ(Integer.valueOf(((List) pair.getFirst()).size()), "list_size");
        c760160TrqLIZJ.LJIIIZ();
    }

    public final C16FS getAddBlockKeywordBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.acx);
            this.LLILLL = (C16FS) callbackFindViewById;
        }
        return (C16FS) callbackFindViewById;
    }

    public final RecyclerView getBlockWordListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c49);
            this.LLILZIL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final ConstraintLayout getContentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eux);
            this.LLJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C16FS getEmptyAddBlockKeywordBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.h1q);
            this.LLILZ = (C16FS) callbackFindViewById;
        }
        return (C16FS) callbackFindViewById;
    }

    public final LinearLayout getEmptyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.h27);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C16F5 getKeywordsNumTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m3b);
            this.LLIZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final LiveEditText getSearchEditFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u9t);
            this.LL = (LiveEditText) callbackFindViewById;
        }
        return (LiveEditText) callbackFindViewById;
    }

    public final LinearLayout getSearchEmptyViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u9y);
            this.LLJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getSearchGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uad);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LiveIconView getSearchIvCancelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uba);
            this.LLILLJJLI = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final void LJI() {
        Editable editableLLLFZ = C2204961BRm.LLLFZ(getSearchEditFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujEiCsamTfWhaqN4GxWOxvyQ==", null));
        if (editableLLLFZ != null) {
            editableLLLFZ.clear();
        }
        if ((this.LLJILJILJ != null ? ((ArrayList) r0.LLILLL).size() : 0) >= this.LLJILLL) {
            C766270U4b.LIZLLL(2131842766);
            return;
        }
        Function1<? super Integer, Unit> function1 = this.LLJJIII;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.LLJJ));
        }
    }

    public final void LJIIIIZZ() throws Throwable {
        Editable editableLLLFZ = C2204961BRm.LLLFZ(getSearchEditFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujEiCsamTfWhaqN4GxWOxvyQ==", null));
        boolean z = editableLLLFZ != null && editableLLLFZ.length() > 0;
        C748760TYs c748760TYs = this.LLJILJILJ;
        int size = c748760TYs != null ? ((ArrayList) c748760TYs.LLILLL).size() : 0;
        getKeywordsNumTipFromXml().setText(C497740JfY.LJIJJ(2131835608, Integer.valueOf(size), Long.valueOf(this.LLJILLL)));
        if (z || size != 0) {
            C500260Jjc.LJIILIIL(getEmptyContainerFromXml());
            C500260Jjc.LLFFF(getContentContainerFromXml());
            C500260Jjc.LJLJLJ(getBlockWordListFromXml(), size > 0);
            C500260Jjc.LJLJLJ(getSearchEmptyViewFromXml(), size == 0);
            return;
        }
        C500260Jjc.LLFFF(getEmptyContainerFromXml());
        C500260Jjc.LJIILIIL(getContentContainerFromXml());
        if (this.LLJIJIL) {
            C500260Jjc.LJIILJJIL(getSearchEditFromXml());
        }
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZ(BlockWord blockWord) {
        C748760TYs c748760TYs = this.LLJILJILJ;
        if (c748760TYs != null) {
            ListProtector.add(c748760TYs.LLILLL, 0, blockWord);
            ListProtector.add(c748760TYs.LLILLJJLI, 0, blockWord);
            c748760TYs.notifyItemInserted(0);
        }
        getBlockWordListFromXml().scrollToPosition(0);
        LJIIIIZZ();
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZIZ(BlockWord blockWord) throws Throwable {
        int i;
        Pair pair;
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        DataChannel dataChannel = this.LLJJIJIL;
        c0tz7.getClass();
        if (dataChannel != null && (pair = (Pair) dataChannel.gg0(C0TZA.class)) != null && !((List) pair.getFirst()).isEmpty()) {
            C500260Jjc.LJJJLZIJ((Collection) pair.getFirst(), new AwS591S0100000_12(blockWord, 1165));
        }
        C748760TYs c748760TYs = this.LLJILJILJ;
        if (c748760TYs != null) {
            int i2 = blockWord.id;
            String str = blockWord.uniqId;
            if (str != null && str.length() == 0) {
                Iterator it2 = ((ArrayList) c748760TYs.LLILLL).iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((BlockWord) it2.next()).id != i2) {
                        i++;
                    } else if (i >= 0) {
                        Object obj = ListProtector.get(c748760TYs.LLILLL, i);
                        ((ArrayList) c748760TYs.LLILLL).remove(obj);
                        ((ArrayList) c748760TYs.LLILLJJLI).remove(obj);
                        c748760TYs.notifyDataSetChanged();
                    }
                }
            } else {
                Iterator it3 = ((ArrayList) c748760TYs.LLILLL).iterator();
                i = 0;
                while (it3.hasNext()) {
                    if (!Intrinsics.LJFF(((BlockWord) it3.next()).uniqId, str)) {
                        i++;
                    } else if (i >= 0 && i < ((ArrayList) c748760TYs.LLILLL).size()) {
                        Object obj2 = ListProtector.get(c748760TYs.LLILLL, i);
                        ((ArrayList) c748760TYs.LLILLL).remove(obj2);
                        ((ArrayList) c748760TYs.LLILLJJLI).remove(obj2);
                        c748760TYs.notifyDataSetChanged();
                    }
                }
            }
        }
        LJIIIIZZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stopword_cancel");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(blockWord.content, "context");
        c474500IjALIZ.LIZ();
    }

    public final void setAddBlockKeywordBtnFromXml(C16FS c16fs) {
        this.LLILLL = c16fs;
    }

    public final void setBlockWordListFromXml(RecyclerView recyclerView) {
        this.LLILZIL = recyclerView;
    }

    public final void setContentContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJ = constraintLayout;
    }

    public final void setEmptyAddBlockKeywordBtnFromXml(C16FS c16fs) {
        this.LLILZ = c16fs;
    }

    public final void setEmptyContainerFromXml(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setKeywordsNumTipFromXml(C16F5 c16f5) {
        this.LLIZ = c16f5;
    }

    public final void setSearchEditFromXml(LiveEditText liveEditText) {
        this.LL = liveEditText;
    }

    public final void setSearchEmptyViewFromXml(LinearLayout linearLayout) {
        this.LLJI = linearLayout;
    }

    public final void setSearchGroupFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setSearchIvCancelFromXml(LiveIconView liveIconView) {
        this.LLILLJJLI = liveIconView;
    }

    public C748790TYv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILJIL = new C748800TYw(this);
        this.LLJILLL = 500L;
        this.LLJJ = 30;
        this.LLJJIJI = "";
        C786120Usc c786120Usc = new C786120Usc(this, 17);
        FrameLayout.inflate(getContext(), R.layout.g0i, this);
        C500260Jjc.LLFFF(getSearchGroupFromXml());
        C786410Ut5.g8(getSearchIvCancelFromXml(), new ACListenerS147S0100000_12((Object) this, 390));
        getSearchEditFromXml().requestFocus();
        C786410Ut5.I7(new AbS694S0100000_12(this, 28), getSearchEditFromXml());
        getSearchEditFromXml().removeTextChangedListener(c786120Usc);
        getSearchEditFromXml().addTextChangedListener(c786120Usc);
        C786410Ut5.I7(new AbS694S0100000_12(this, 29), getAddBlockKeywordBtnFromXml());
        C786410Ut5.I7(new AbS694S0100000_12(this, 30), getEmptyAddBlockKeywordBtnFromXml());
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZLLL(List<BlockWord> list, long j, long j2) throws Throwable {
        DataChannel dataChannel;
        this.LLJJIJIIJIL = true;
        this.LLJILLL = j;
        this.LLJJ = (int) j2;
        C748760TYs c748760TYs = this.LLJILJILJ;
        if (c748760TYs != null && list != null && !list.isEmpty()) {
            ((ArrayList) c748760TYs.LLILLL).clear();
            ((ArrayList) c748760TYs.LLILLL).addAll(list);
            ((ArrayList) c748760TYs.LLILLJJLI).clear();
            ((ArrayList) c748760TYs.LLILLJJLI).addAll(list);
            c748760TYs.notifyDataSetChanged();
        }
        LJIIIIZZ();
        if (!Intrinsics.LJFF(this.LLJJIJI, "live_take_page") && (dataChannel = this.LLJJIJIL) != null) {
            ArrayList arrayList = new ArrayList(list);
            BlockWordGetExtra blockWordGetExtra = new BlockWordGetExtra();
            blockWordGetExtra.maxCount = j;
            blockWordGetExtra.maxLength = j2;
            dataChannel.SX0(C0TZA.class, new Pair(arrayList, blockWordGetExtra));
        }
    }

    public final void LJII(DataChannel dataChannel, boolean z, String str, long j, String str2, Function1<? super Integer, Unit> function1) {
        this.LLJJIJIL = dataChannel;
        this.LLJJI = z;
        this.LLJJIII = function1;
        this.LLJJIJI = str2;
        C748800TYw c748800TYw = this.LLJILJIL;
        c748800TYw.LIZLLL = z;
        c748800TYw.LJ = str;
        c748800TYw.LJFF = j;
        c748800TYw.LJI = true;
        c748800TYw.LIZJ = str2;
        this.LLJILJILJ = new C748760TYs(new AwS591S0100000_12(this, 1011));
        RecyclerView blockWordListFromXml = getBlockWordListFromXml();
        blockWordListFromXml.setAdapter(this.LLJILJILJ);
        blockWordListFromXml.setLayoutManager(new LinearLayoutManager(blockWordListFromXml.getContext()));
        C500260Jjc.LLFFF(getBlockWordListFromXml());
        getBlockWords();
    }
}
