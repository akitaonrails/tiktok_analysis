package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514670KGj extends C0K07<C515570KJv> {
    public final RecyclerView LL;
    public final C514660KGi LLILLJJLI;
    public final int LLILLL;

    public C514670KGj(View view) {
        super(view);
        this.LL = (RecyclerView) view.findViewById(R.id.qlv);
        this.LLILLJJLI = new C514660KGi();
        this.LLILLL = (int) C497740JfY.LIZIZ(12.0f);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        ISubPackagePageAbility iSubPackagePageAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC515480KJm) interfaceC515600KJy).LL;
        C513700KCq c513700KCqKu = null;
        if (interfaceC665370Q7z != null) {
            iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null);
            if (iSubPackagePageAbility != null) {
                c513700KCqKu = iSubPackagePageAbility.Ku();
            }
        } else {
            iSubPackagePageAbility = null;
        }
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setAdapter(this.LLILLJJLI);
            recyclerView.addItemDecoration(new C515010KHr(this.LLILLL));
            recyclerView.setOverScrollMode(2);
        }
        this.LLILLJJLI.LLILZIL = iSubPackagePageAbility;
        if (iSubPackagePageAbility != null) {
            iSubPackagePageAbility.cu(new C514690KGl(this, c513700KCqKu));
        }
    }
}
