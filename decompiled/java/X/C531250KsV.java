package X;

import Y.ACallableS61S1100000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531250KsV extends AbstractC21673619ry<C531230KsT> {
    public final float LLILLJJLI;
    public final int LLILLL;
    public final Context LLILZIL;
    public final VEMediaParserProviderV2 LLIZ;
    public final boolean LL = true;
    public TikTokMediaModel LLILZ = null;
    public final C532990KvJ LLILZLL = new LruCache<String, Bitmap>() { // from class: X.0KvJ
        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    };
    public final Set<TikTokMediaModel> LLIZLLLIL = new LinkedHashSet();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL;
    }

    public final void LLLFZ(TikTokMediaModel tikTokMediaModel) {
        String strLJFF;
        Bitmap bitmapLLLI = LLLI(tikTokMediaModel.LJFF());
        if ((bitmapLLLI == null || bitmapLLLI.isRecycled()) && (strLJFF = tikTokMediaModel.LJFF()) != null && C123100dR.LIZ(strLJFF) && C2286708xd.LIZJ(strLJFF)) {
            C15O7.LIZJ(new ACallableS61S1100000_8(this, strLJFF, 3));
        }
    }

    public final Bitmap LLLI(String str) {
        Bitmap bitmap;
        if (str == null) {
            return null;
        }
        synchronized (this.LLILZLL) {
            try {
                bitmap = get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return bitmap;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LL) {
            return 2;
        }
        if (i == 0) {
            return 0;
        }
        if (i != this.LLILLL - 1) {
            return 2;
        }
        return 1;
    }

    public final void LLLII(int i, int i2) {
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        while (true) {
            if ((i2 <= 512 && i <= 512) || (i3 = i2 >> 1) < 64 || (i4 = i >> 1) < 64) {
                break;
            }
            i2 = i3;
            i = i4;
        }
        VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LLIZ;
        vEMediaParserProviderV2.LLIZLLLIL = i;
        vEMediaParserProviderV2.LLJ = i2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strLJFF;
        String strLJFF2;
        final C531230KsT c531230KsT = (C531230KsT) viewHolder;
        TikTokMediaModel tikTokMediaModel = this.LLILZ;
        if (tikTokMediaModel != null) {
            LLLII(tikTokMediaModel.width, tikTokMediaModel.height);
        }
        if (i == 0) {
            VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LLIZ;
            if (vEMediaParserProviderV2.LLILLJJLI.size() > 8) {
                vEMediaParserProviderV2.LIZJ();
            }
        }
        String strLJFF3 = null;
        if (this.LL) {
            TikTokMediaModel tikTokMediaModel2 = this.LLILZ;
            if (tikTokMediaModel2 != null) {
                strLJFF3 = tikTokMediaModel2.LJFF();
            }
            Bitmap bitmapLLLI = LLLI(strLJFF3);
            if (bitmapLLLI != null && !bitmapLLLI.isRecycled()) {
                c531230KsT.LLILLJJLI.setImageBitmap(bitmapLLLI);
            } else {
                TikTokMediaModel tikTokMediaModel3 = this.LLILZ;
                if (tikTokMediaModel3 != null && (strLJFF2 = tikTokMediaModel3.LJFF()) != null && C123100dR.LIZ(strLJFF2) && C2286708xd.LIZJ(strLJFF2)) {
                    C1324750kZt.LJIIJ(c531230KsT.LLILLJJLI, C2471909mP.LJIILIIL(strLJFF2).toString(), (int) this.LLILLJJLI, C366700EZg.LIZ(48.0d), Bitmap.Config.ARGB_8888);
                }
            }
        } else {
            TikTokMediaModel tikTokMediaModel4 = this.LLILZ;
            if (tikTokMediaModel4 != null && (strLJFF = tikTokMediaModel4.LJFF()) != null && C123100dR.LIZ(strLJFF) && C2286708xd.LIZJ(strLJFF)) {
                C1324750kZt.LJIIIZ(c531230KsT.LLILLJJLI, C2471909mP.LJIILIIL(strLJFF).toString(), -1, -1);
            }
        }
        final TikTokMediaModel tikTokMediaModel5 = this.LLILZ;
        if (tikTokMediaModel5 != null) {
            final float f = (i / this.LLILLL) * tikTokMediaModel5.duration;
            StringBuilder sb = new StringBuilder();
            sb.append(tikTokMediaModel5.LJFF());
            int i2 = (int) f;
            sb.append(i2);
            c531230KsT.LLILLJJLI.setTag(sb.toString());
            this.LLIZ.LIZIZ(i, tikTokMediaModel5.LJFF(), i2, new InterfaceC534950KyT() { // from class: X.0KsS
                @Override // X.InterfaceC534950KyT
                public final void LIZ(Bitmap bitmap) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(tikTokMediaModel5.LJFF());
                    sbLIZ.append((int) f);
                    if (Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), c531230KsT.LLILLJJLI.getTag())) {
                        c531230KsT.LLILLJJLI.setActualImageScaleType(EnumC1338240kve.FIT_CENTER);
                        c531230KsT.LLILLJJLI.setImageBitmap(bitmap);
                    }
                    int bindingAdapterPosition = c531230KsT.getBindingAdapterPosition();
                    C531250KsV c531250KsV = this;
                    if (bindingAdapterPosition == c531250KsV.LLILLL - 1) {
                        for (TikTokMediaModel tikTokMediaModel6 : c531250KsV.LLIZLLLIL) {
                            C531250KsV c531250KsV2 = this;
                            c531250KsV2.getClass();
                            c531250KsV2.LLLII(tikTokMediaModel6.width, tikTokMediaModel6.height);
                            int i3 = c531250KsV2.LLILLL;
                            if (i3 >= 0) {
                                int i4 = 0;
                                while (true) {
                                    c531250KsV2.LLIZ.LIZIZ(i4, tikTokMediaModel6.LJFF(), (int) ((i4 / c531250KsV2.LLILLL) * tikTokMediaModel6.duration), new InterfaceC534950KyT() { // from class: X.0KsU
                                        @Override // X.InterfaceC534950KyT
                                        public final void LIZ(Bitmap bitmap2) {
                                        }
                                    }, true);
                                    if (i4 != i3) {
                                        i4++;
                                    }
                                }
                            }
                        }
                        this.LLIZLLLIL.clear();
                    }
                }
            }, true);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ImageView.ScaleType scaleType;
        String strLJFF;
        int i2;
        Drawable drawableLIZ;
        String strLJFF2;
        FrameLayout frameLayout = new FrameLayout(this.LLILZIL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.LLILLJJLI, -1);
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams);
        SmartImageView smartImageView = new SmartImageView(this.LLILZIL);
        C786410Ut5.G6(smartImageView, new ViewGroup.LayoutParams(-1, -1));
        if (this.LL) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        smartImageView.setScaleType(scaleType);
        String strLJFF3 = null;
        if (this.LL) {
            TikTokMediaModel tikTokMediaModel = this.LLILZ;
            if (tikTokMediaModel != null) {
                strLJFF3 = tikTokMediaModel.LJFF();
            }
            Bitmap bitmapLLLI = LLLI(strLJFF3);
            if (bitmapLLLI != null && !bitmapLLLI.isRecycled()) {
                smartImageView.setImageBitmap(bitmapLLLI);
            } else {
                TikTokMediaModel tikTokMediaModel2 = this.LLILZ;
                if (tikTokMediaModel2 != null && (strLJFF2 = tikTokMediaModel2.LJFF()) != null && C123100dR.LIZ(strLJFF2) && C2286708xd.LIZJ(strLJFF2)) {
                    C1324750kZt.LJIIJ(smartImageView, C2471909mP.LJIILIIL(strLJFF2).toString(), (int) this.LLILLJJLI, C366700EZg.LIZ(48.0d), Bitmap.Config.RGB_565);
                }
            }
        } else {
            TikTokMediaModel tikTokMediaModel3 = this.LLILZ;
            if (tikTokMediaModel3 != null && (strLJFF = tikTokMediaModel3.LJFF()) != null && C123100dR.LIZ(strLJFF) && C2286708xd.LIZJ(strLJFF)) {
                float f = this.LLILLJJLI;
                int i3 = (int) f;
                if (this.LLILZ != null) {
                    i2 = (int) (r2.height * (f / r2.width));
                } else {
                    i2 = i3;
                }
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(C2471909mP.LJIILIIL(strLJFF));
                c1331670kl3LJI.LJJ(smartImageView);
                c1331670kl3LJI.LJIL = Bitmap.Config.RGB_565;
                c1331670kl3LJI.LJJ = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJI.LJIIIIZZ = i3;
                c1331670kl3LJI.LJIIIZ = i2;
                c1331670kl3LJI.LJJIL = true;
                smartImageView.LIZ(c1331670kl3LJI.LIZJ());
            }
        }
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        if (i != 0) {
            if (i != 1) {
                if (this.LL) {
                    drawableLIZ = C800330VaR.LIZIZ(this.LLILZIL, R.drawable.auk);
                } else {
                    C384050F3z c384050F3z = new C384050F3z();
                    int iLIZJ = C1308910kAL.LIZJ(R.attr.e1, this.LLILZIL);
                    if (iLIZJ == null) {
                        iLIZJ = -16777216;
                    }
                    c384050F3z.LIZ = iLIZJ;
                    drawableLIZ = c384050F3z.LIZ(this.LLILZIL);
                }
                frameLayout.setBackground(drawableLIZ);
            } else {
                C384050F3z c384050F3z2 = new C384050F3z();
                int iLIZJ2 = C1308910kAL.LIZJ(R.attr.e1, this.LLILZIL);
                if (iLIZJ2 == null) {
                    iLIZJ2 = -16777216;
                }
                c384050F3z2.LIZ = iLIZJ2;
                c384050F3z2.LJIIIZ = Float.valueOf(fLIZIZ);
                c384050F3z2.LJIIJJI = Float.valueOf(fLIZIZ);
                frameLayout.setBackground(c384050F3z2.LIZ(this.LLILZIL));
            }
        } else {
            C384050F3z c384050F3z3 = new C384050F3z();
            int iLIZJ3 = C1308910kAL.LIZJ(R.attr.e1, this.LLILZIL);
            if (iLIZJ3 == null) {
                iLIZJ3 = -16777216;
            }
            c384050F3z3.LIZ = iLIZJ3;
            c384050F3z3.LJIIIIZZ = Float.valueOf(fLIZIZ);
            c384050F3z3.LJIIJ = Float.valueOf(fLIZIZ);
            frameLayout.setBackground(c384050F3z3.LIZ(this.LLILZIL));
        }
        frameLayout.addView(smartImageView);
        C531230KsT c531230KsT = new C531230KsT(frameLayout, smartImageView);
        try {
            View view = c531230KsT.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c531230KsT.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c531230KsT.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C531230KsT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c531230KsT.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c531230KsT.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C531230KsT.class.getName();
        return c531230KsT;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0KvJ] */
    public C531250KsV(float f, int i, Context context, Lifecycle lifecycle) {
        this.LLILLJJLI = f;
        this.LLILLL = i;
        this.LLILZIL = context;
        this.LLIZ = new VEMediaParserProviderV2(context, lifecycle);
    }
}
