package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0nF5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427170nF5 extends AbstractC1664490tPr<C1426120nDO, C1426160nDS> {
    public C1427190nF7 LLJJJIL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C1214930hil c1214930hil;
        TuxTextView tuxTextView;
        String string;
        TuxIconView tuxIconView;
        super.onViewCreated(view, bundle);
        C1427190nF7 c1427190nF7 = this.LLJJJIL;
        if (c1427190nF7 != null && (tuxIconView = c1427190nF7.LLILLJJLI) != null) {
            C375780EoK.LIZIZ(tuxIconView, false);
        }
        C1427190nF7 c1427190nF72 = this.LLJJJIL;
        if (c1427190nF72 != null && (tuxTextView = c1427190nF72.LLILZ) != null) {
            Context contextLIZIZ = C545820Lau.LIZIZ(this);
            if (contextLIZIZ != null) {
                string = contextLIZIZ.getString(2131834084);
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        C1427190nF7 c1427190nF73 = this.LLJJJIL;
        if (c1427190nF73 != null && (c1214930hil = c1427190nF73.LLILLL) != null) {
            c1214930hil.setEnableToggleChip(false);
            c1214930hil.setOnChipClickListener(new AwS636S0100000_22(this, 3));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nDh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426120nDO) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 85));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1427190nF7 c1427190nF7LIZ = C1427190nF7.LIZ(layoutInflater, viewGroup);
        this.LLJJJIL = c1427190nF7LIZ;
        return c1427190nF7LIZ.LL;
    }
}
