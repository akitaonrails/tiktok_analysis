package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.FlashDataProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KJA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJA extends C0KJD {
    public final C01GW LLIZLLLIL;

    private final C0KJC getMultiTypeAdapter() {
        return (C0KJC) this.LLIZLLLIL.getValue();
    }

    @Override // X.C0KJD
    public InterfaceC508520Jww<InterfaceC515600KJy> getListAdapter() {
        return getMultiTypeAdapter();
    }

    public final void LIZLLL(Map<Class<? extends InterfaceC515600KJy>, ? extends C0K06<? extends InterfaceC515600KJy, ?>> map) {
        for (Map.Entry<Class<? extends InterfaceC515600KJy>, ? extends C0K06<? extends InterfaceC515600KJy, ?>> entry : map.entrySet()) {
            getMultiTypeAdapter().LLLI(entry.getKey(), entry.getValue());
        }
    }

    public C0KJA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(413));
    }

    public static void LIZJ(C0KJA c0kja, List list, C514960KHm c514960KHm) {
        final List list2 = null;
        final List<?> listLIZ = c0kja.LIZ(list, null, c514960KHm);
        final List<InterfaceC515600KJy> listLLILIL = c0kja.getMultiTypeAdapter().LLILIL();
        if (listLLILIL == null) {
            listLLILIL = C13BV.INSTANCE;
        }
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(listLLILIL, listLIZ, list2) { // from class: X.0KJB
            public final List<InterfaceC515600KJy> LIZ;
            public final List<InterfaceC515600KJy> LIZIZ;
            public final List<String> LIZJ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                InterfaceC515600KJy interfaceC515600KJy = (InterfaceC515600KJy) ListProtector.get(this.LIZ, i);
                InterfaceC515600KJy interfaceC515600KJy2 = (InterfaceC515600KJy) ListProtector.get(this.LIZIZ, i2);
                List<String> list3 = this.LIZJ;
                if (list3 != null && list3.contains(interfaceC515600KJy2.LJJJ())) {
                    return false;
                }
                return interfaceC515600KJy.LIZ(interfaceC515600KJy2);
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                return Intrinsics.LJFF(((InterfaceC515600KJy) ListProtector.get(this.LIZ, i)).LJJJ(), ((InterfaceC515600KJy) ListProtector.get(this.LIZIZ, i2)).LJJJ());
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = listLLILIL;
                this.LIZIZ = listLIZ;
                this.LIZJ = list2;
            }
        }, true);
        C0KJC multiTypeAdapter = c0kja.getMultiTypeAdapter();
        multiTypeAdapter.LL = listLIZ;
        multiTypeAdapter.notifyDataSetChanged();
        c21341918fZLIZ.LIZJ(c0kja.getMultiTypeAdapter());
    }

    public static void LIZIZ(C0KJA c0kja, List list, final FlashDataProvider flashDataProvider, Function1 function1, int i) {
        if ((i & 4) != 0) {
            flashDataProvider = null;
        }
        RecyclerView bodyListView = c0kja.getBodyListView();
        if (bodyListView != null) {
            bodyListView.setAdapter(c0kja.getMultiTypeAdapter());
        }
        c0kja.getMultiTypeAdapter().LLLI(C0KJG.class, new C0K06<C0KJG, C0KJE>(flashDataProvider) { // from class: X.0KJ9
            public final FlashDataProvider LIZIZ;

            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.ggb;
            }

            {
                this.LIZIZ = flashDataProvider;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C0KJE(view, this.LIZIZ);
            }
        });
        List<?> listLIZ = c0kja.LIZ(list, null, function1);
        C0KJC multiTypeAdapter = c0kja.getMultiTypeAdapter();
        multiTypeAdapter.LL = listLIZ;
        multiTypeAdapter.notifyDataSetChanged();
        c0kja.getMultiTypeAdapter().notifyDataSetChanged();
    }
}
