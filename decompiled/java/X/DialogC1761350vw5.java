package X;

import Y.AsS8S0101000_26;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0vw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class DialogC1761350vw5 extends DialogC19728412Gs {
    public final RecyclerView LL;
    public final FrameLayout LLILLJJLI;
    public boolean LLILLL;
    public AbstractC1763150vyz<?> LLILZ;
    public AbstractC21679819sy LLILZIL;
    public int LLILZLL;
    public RecyclerView.ViewHolder LLIZ;
    public final List<InterfaceC1761370vw7> LLIZLLLIL;

    public void LJJLIIIJLLLLLLLZ(int i) {
        throw null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        AbstractC1763150vyz<?> abstractC1763150vyz;
        if (isShowing() && (abstractC1763150vyz = this.LLILZ) != null) {
            abstractC1763150vyz.onDestroy();
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public DialogC1761350vw5(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        this.LLILLJJLI = frameLayout;
        this.LLILZLL = -1;
        this.LLIZLLLIL = new ArrayList();
        RecyclerView recyclerView = new RecyclerView(context);
        C786410Ut5.p6(recyclerView, new ViewGroup.LayoutParams(-1, -1));
        this.LL = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        new C20635115or().LIZIZ(recyclerView);
        frameLayout.addView(recyclerView, 0);
        recyclerView.addOnScrollListener(new AsS8S0101000_26(this, 2));
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        linearLayoutManager2.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager2);
        this.LLILZIL = new C21679619sw(recyclerView.getLayoutManager());
    }

    public final void LJJLIIJ(int i) {
        if (this.LLILZLL != i) {
            this.LLILZLL = i;
            Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1761370vw7) it2.next()).onPageSelected(i);
            }
            LJJLIIIJLLLLLLLZ(i);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.LLILLJJLI);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.clearFlags(2);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(1280);
        if (Build.VERSION.SDK_INT > 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        this.LLILLJJLI.setBackgroundColor(C960203pA.LIZ(R.attr.e1, getContext()));
        this.LLILLJJLI.getBackground().setAlpha(255);
    }
}
