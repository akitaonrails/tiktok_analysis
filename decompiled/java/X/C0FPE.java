package X;

import Y.AfS174S0100000_5;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0FPE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FPE extends AbstractC21673619ry<C0FPF> {
    public final C19560811fy LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final List<Pair<Integer, Pair<?, ?>>> LLILZ;
    public boolean LLILZIL;
    public C11JF LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        C19560811fy c19560811fy = this.LL;
        return (c19560811fy != null ? c19560811fy.LIZLLL : 0) + 2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((Number) ((Pair) ListProtector.get(this.LLILZ, i)).getFirst()).intValue();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Pair pair;
        Bitmap bitmap;
        ImageView imageView = ((C0FPF) viewHolder).LL;
        if (imageView != null) {
            Pair pair2 = (Pair) ((Pair) ListProtector.get(this.LLILZ, i)).getSecond();
            if ((pair2 == null || (bitmap = (Bitmap) pair2.getSecond()) == null || bitmap.isRecycled()) && ((pair = (Pair) ((Pair) ListProtector.get(this.LLILZ, 1)).getSecond()) == null || (bitmap = (Bitmap) pair.getSecond()) == null || bitmap.isRecycled())) {
                bitmap = null;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0FPF c0fpf;
        if (i == 1) {
            View view = new View(viewGroup.getContext());
            C786410Ut5.W5(view, new FrameLayout.LayoutParams(ScreenUtils.getScreenWidth(viewGroup.getContext()) / 2, this.LLILLL));
            c0fpf = new C0FPF(view);
        } else {
            ImageView imageView = (ImageView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ft9, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = this.LLILLL;
            layoutParams.width = this.LLILLJJLI;
            C786410Ut5.c6(imageView, layoutParams);
            c0fpf = new C0FPF(imageView);
        }
        try {
            View view2 = c0fpf.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0fpf.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0fpf.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0FPF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0fpf.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0fpf.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0FPF.class.getName();
        return c0fpf;
    }

    public C0FPE(C19560811fy c19560811fy, int i, int i2) {
        C11SU c11suLIZ;
        this.LL = c19560811fy;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        ArrayList arrayList = new ArrayList();
        this.LLILZ = arrayList;
        this.LLILZIL = true;
        InterfaceC420801kM interfaceC420801kMLJJLJLI = null;
        ListProtector.add(arrayList, 0, new Pair(1, null));
        if (c19560811fy != null) {
            int i3 = c19560811fy.LIZLLL;
            for (int i4 = 0; i4 < i3; i4++) {
                ListProtector.add(this.LLILZ, 0, new Pair(2, null));
            }
        }
        ListProtector.add(this.LLILZ, 0, new Pair(1, null));
        C19560811fy c19560811fy2 = this.LL;
        if (c19560811fy2 != null && (c11suLIZ = c19560811fy2.LIZ()) != null) {
            interfaceC420801kMLJJLJLI = c11suLIZ.LJJLJLI(new AfS174S0100000_5(this, 1));
        }
        this.LLILZLL = (C11JF) interfaceC420801kMLJJLJLI;
    }
}
