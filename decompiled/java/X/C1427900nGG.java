package X;

import Y.ACListenerS125S0200000_22;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.Icon;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nGG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427900nGG extends AbstractC21673619ry<C1427920nGI> {
    public final C1427950nGL LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public List<PhotoTemplateAsset> LLILZ;
    public PhotoTemplateAsset LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (this.LLILZ.isEmpty()) {
            return 10;
        }
        return this.LLILZ.size();
    }

    public C1427900nGG(Context context, C1427950nGL c1427950nGL) {
        int iIntValue;
        this.LL = c1427950nGL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zl, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLILLJJLI = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, context);
        this.LLILLL = numLIZJ2 != null ? numLIZJ2.intValue() : -1;
        this.LLILZ = C13BV.INSTANCE;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        Asset asset;
        Asset asset2;
        Icon icon;
        List<String> url_list;
        C1427920nGI c1427920nGI = (C1427920nGI) viewHolder;
        PhotoTemplateAsset photoTemplateAsset = (PhotoTemplateAsset) C13LP.LJJJLZIJ(i, this.LLILZ);
        String asset_id = null;
        if (photoTemplateAsset != null && (asset2 = photoTemplateAsset.getAsset()) != null && (icon = asset2.getIcon()) != null && (url_list = icon.getUrl_list()) != null) {
            str = (String) C13LP.LJJJLL(url_list);
        } else {
            str = null;
        }
        if (photoTemplateAsset == null) {
            c1427920nGI.LLILZ.setLoading(true);
            c1427920nGI.LLILZIL.setLoading(true);
            c1427920nGI.LLILLJJLI.setImageBitmap(null);
            c1427920nGI.LLILLJJLI.setBackgroundDrawable(null);
            C786410Ut5.LJLLLLLL(8, c1427920nGI.LL);
            c1427920nGI.LLILLL.setText("");
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0nGK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }, c1427920nGI.itemView);
            return;
        }
        c1427920nGI.LLILZ.setLoading(false);
        c1427920nGI.LLILZIL.setLoading(false);
        Asset asset3 = photoTemplateAsset.getAsset();
        C371780Ehs.LIZLLL(asset3);
        String asset_id2 = asset3.getAsset_id();
        PhotoTemplateAsset photoTemplateAsset2 = this.LLILZIL;
        if (photoTemplateAsset2 != null && (asset = photoTemplateAsset2.getAsset()) != null) {
            asset_id = asset.getAsset_id();
        }
        boolean zLJFF = Intrinsics.LJFF(asset_id2, asset_id);
        if (zLJFF) {
            C786410Ut5.LJLLLLLL(0, c1427920nGI.LL);
        } else {
            C786410Ut5.LJLLLLLL(8, c1427920nGI.LL);
        }
        C1322110kVd c1322110kVd = c1427920nGI.LLILLJJLI;
        C1324750kZt.LJIIIZ(c1322110kVd, str, -1, -1);
        c1322110kVd.setBackgroundResource(R.drawable.bon);
        TuxTextView tuxTextView = c1427920nGI.LLILLL;
        Asset asset4 = photoTemplateAsset.getAsset();
        C371780Ehs.LIZLLL(asset4);
        tuxTextView.setText(asset4.getTitle());
        if (zLJFF) {
            tuxTextView.setTextColor(this.LLILLL);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            tuxTextView.setMarqueeRepeatLimit(-1);
            tuxTextView.requestFocus();
        } else {
            tuxTextView.setTextColor(this.LLILLJJLI);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        C786410Ut5.I7(new ACListenerS125S0200000_22(this, photoTemplateAsset, 1), c1427920nGI.itemView);
        MutableLiveData<AbstractC1427970nGN> event = this.LL.getEvent();
        if (event == null) {
            return;
        }
        event.setValue(new C1427910nGH(photoTemplateAsset));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eqi, viewGroup, false);
        C1322110kVd c1322110kVd = (C1322110kVd) viewTd.findViewById(R.id.kdw);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.ke1);
        View viewFindViewById = viewTd.findViewById(R.id.kdy);
        C20627315nb c20627315nb = (C20627315nb) viewTd.findViewById(R.id.kdz);
        C20626615nU c20626615nU = (C20626615nU) viewTd.findViewById(R.id.ke0);
        Paint paint = new Paint();
        paint.setTextSize(C418440Gaw.LIZIZ(16));
        c20626615nU.setFontConfig(new C1428010nGR(C418440Gaw.LIZIZ(16), paint));
        C1427920nGI c1427920nGI = new C1427920nGI(viewTd, viewFindViewById, c1322110kVd, tuxTextView, c20627315nb, c20626615nU);
        try {
            View view = c1427920nGI.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1427920nGI.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1427920nGI.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1427920nGI.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1427920nGI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1427920nGI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1427920nGI.class.getName();
        return c1427920nGI;
    }
}
