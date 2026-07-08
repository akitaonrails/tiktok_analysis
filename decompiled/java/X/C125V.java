package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.125V, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C125V extends C05YF {
    LiveData<TextStickerData> D9();

    void DJ0();

    void Dc0();

    void Dg(boolean z);

    void Eu(boolean z);

    void Fo();

    boolean Gb();

    C560530Lyd<Unit> H1();

    void Jp0(C125R c125r);

    InterfaceC196985125f LJJIFFI();

    void LJJJJJ(int i);

    boolean LJJJLZIJ();

    boolean LJLL();

    void LLJJIJIL();

    void LLLLJ();

    List<C125R> LLLLLLZZ();

    boolean LLLLZLLIL();

    void Md();

    void Pb(boolean z);

    void R3(boolean z);

    void T1();

    void T3(Function1<? super C125R, Unit> function1);

    void Uw2(C125X c125x);

    void V1(Function2<? super C125R, ? super C125R, Unit> function2);

    void Z3(MutableLiveData<Boolean> mutableLiveData);

    void a2(boolean z);

    void aa(boolean z);

    void b(Pair<Integer, Integer> pair);

    boolean b8();

    void bf();

    boolean c0();

    C560530Lyd<Boolean> c2();

    void d3();

    void f8(Function1<? super C125R, Unit> function1);

    String getTextContent();

    void hW0(C125R c125r);

    void i();

    void ja(boolean z);

    void kQ2(String str);

    C385670FAf<Boolean> mo();

    List<InteractStickerStruct> nt(Context context, List<? extends StickerItemModel> list, Gson gson);

    List<TextStickerData> on();

    void ov(TextWatcher textWatcher);

    void qs(View.OnClickListener onClickListener);

    void setEnable(boolean z);

    void show();

    void tm(boolean z);

    C560530Lyd<Pair<Boolean, Boolean>> u2();

    void wv0(C125R c125r);

    void yr(boolean z);
}
