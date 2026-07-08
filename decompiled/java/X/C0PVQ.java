package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0PVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PVQ extends AbstractC21673619ry<C0PVR> {
    public List<ClickSearchWord> LL = C13BV.INSTANCE;
    public ISearchContextAbility LLILLJJLI;
    public C653660PkS LLILLL;
    public C0PUB LLILZ;
    public String LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C0PVR c0pvr = (C0PVR) viewHolder;
        final ClickSearchWord clickSearchWord = (ClickSearchWord) ListProtector.get(this.LL, i);
        ISearchContextAbility iSearchContextAbility = this.LLILLJJLI;
        final C653660PkS c653660PkS = this.LLILLL;
        final String str = this.LLILZIL;
        final C0PUB c0pub = this.LLILZ;
        c0pvr.LLILZIL = clickSearchWord;
        c0pvr.LLILZLL = str;
        if (clickSearchWord != null) {
            c0pvr.LLILLJJLI = iSearchContextAbility;
            c0pvr.LLILLL = c653660PkS;
            c0pvr.LLILZ = c0pub;
            TuxTextView tuxTextView = c0pvr.LL;
            final Context context = c0pvr.itemView.getContext();
            AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0PVS
                @Override // X.AbstractViewOnTouchListenerC446430Hez
                public final void LIZ(boolean z) {
                    int iIntValue;
                    if (z) {
                        TuxTextView tuxTextView2 = c0pvr.LL;
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c0pvr.itemView.getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        tuxTextView2.setForeground(new ColorDrawable(iIntValue));
                        return;
                    }
                    c0pvr.LL.setForeground(null);
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZ = new InterfaceC446420Hey() { // from class: X.0PV6
                @Override // X.InterfaceC446420Hey
                public final void LIZ() {
                    C0PV3 c0pv3 = C0PV3.LIZ;
                    ClickSearchWord clickSearchWord2 = clickSearchWord;
                    View view = c0pvr.itemView;
                    Context context2 = view.getContext();
                    C653660PkS c653660PkS2 = c653660PkS;
                    c0pv3.getClass();
                    C0PV3.LIZIZ(clickSearchWord2, view, context2, c653660PkS2);
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new View.OnTouchListener() { // from class: X.0PV5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 1 && !C0OBG.LIZIZ(view)) {
                        C0PV3 c0pv3 = C0PV3.LIZ;
                        ClickSearchWord clickSearchWord2 = clickSearchWord;
                        View view2 = c0pvr.itemView;
                        C653660PkS c653660PkS2 = c653660PkS;
                        String str2 = str;
                        C0PUB c0pub2 = c0pub;
                        c0pv3.getClass();
                        C0PV3.LIZ(clickSearchWord2, view2, c653660PkS2, str2, c0pub2);
                        return false;
                    }
                    return false;
                }
            };
            tuxTextView.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
            c0pvr.LL.setText(clickSearchWord.word);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C0PVR.LLIZ;
        int iIntValue = 0;
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setWidth(-2);
        tuxTextView.setHeight(C0PVR.LLJ);
        tuxTextView.setTextDirection(5);
        tuxTextView.setTextAlignment(5);
        int i3 = C0PVR.LLIZ;
        tuxTextView.setPaddingRelative(i3, 0, i3, 0);
        tuxTextView.setMaxLines(2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.br, viewGroup.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxTextView.setBackgroundColor(iIntValue);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setTuxFont(52);
        tuxTextView.setGravity(8388627);
        tuxTextView.setId(R.id.ua_);
        C0PVR c0pvr = new C0PVR(tuxTextView);
        try {
            View view = c0pvr.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0pvr.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0pvr.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0PVR.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0pvr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0pvr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0PVR.class.getName();
        return c0pvr;
    }
}
