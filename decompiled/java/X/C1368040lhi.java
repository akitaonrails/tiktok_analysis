package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0lhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368040lhi extends FrameLayout implements InterfaceC1368050lhj {
    public List<? extends InterfaceC1369790lkX> LL;
    public InterfaceC1368050lhj LLILLJJLI;
    public final C1369780lkW LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1368040lhi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C13BV.INSTANCE;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MicroShareChannelBar);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MicroShareChannelBar_hideLabel, false);
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d8g, this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.doe);
        C1369780lkW c1369780lkW = new C1369780lkW(context, this, 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 1904);
        this.LLILLL = c1369780lkW;
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        c1369780lkW.setData(this.LL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c1369780lkW);
    }

    @Override // X.InterfaceC1368050lhj
    public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
        InterfaceC1368050lhj interfaceC1368050lhj = this.LLILLJJLI;
        if (interfaceC1368050lhj != null) {
            interfaceC1368050lhj.LJIIIIZZ(interfaceC1369790lkX, view);
        }
    }
}
