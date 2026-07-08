package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19712212Am implements InterfaceC19712612Aq {
    public final ViewGroup LIZ;

    @Override // X.InterfaceC19712612Aq
    public final void LIZ() {
        C375780EoK.LIZIZ(this.LIZ.findViewById(R.id.pw_), false);
        ((RecyclerView) this.LIZ.findViewById(R.id.vkt)).setLayoutManager(new LinearLayoutManager(this.LIZ.getContext(), 0, false));
        ((RecyclerView) this.LIZ.findViewById(R.id.vkt)).addItemDecoration(new C0DXR(this) { // from class: X.12An
            public final boolean LL;

            {
                this.LL = C444960Hcc.LIZJ(this.LIZ.getContext());
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition != -1 && childAdapterPosition == 0) {
                    if (this.LL) {
                        rect.right = C19712512Ap.LIZ;
                    } else {
                        rect.left = C19712512Ap.LIZ;
                    }
                }
            }
        });
    }

    public C19712212Am(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}
