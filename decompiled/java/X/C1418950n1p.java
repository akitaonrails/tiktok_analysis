package X;

import Y.ACListenerS156S0100000_22;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS161S0101000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418950n1p extends AbstractC21673619ry<C1418960n1q> {
    public static final C1418420n0y LLJILJIL = new C1418420n0y(0.0f, 0.1f, 0.1f, 0.8f);
    public static final C1418420n0y LLJILJILJ = new C1418420n0y(0.0f, 0.5f, 0.5f, 8);
    public final Function1<Integer, Unit> LL;
    public final InterfaceC1631630sYr<View, Integer, AutoCutThemeData, Boolean, Unit> LLILLJJLI;
    public int LLILZ;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public AwS601S0100000_22 LLJI;
    public final List<C443120HZe<Integer, PorterDuff.Mode, Float>> LLJIJIL;
    public final List<AutoCutThemeData> LLILLL = new ArrayList();
    public boolean LLILZIL = true;
    public Map<String, C1416070mxB> LLILZLL = C2097608Jq.LJ();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public final void LLLII(List<AutoCutThemeData> list) {
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(list);
        notifyDataSetChanged();
    }

    public final void LLLIIIIL(int i) {
        int i2 = this.LLILZ;
        if (i2 == i) {
            return;
        }
        this.LLILZ = i;
        if (i2 >= 0) {
            notifyItemChanged(i2);
        }
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < ((ArrayList) this.LLILLL).size() && ((AutoCutThemeData) ListProtector.get(this.LLILLL, i)).LIZIZ() == C0MJ9.PLACE_HOLDER) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        this.LL.invoke(Integer.valueOf(viewHolder.getBindingAdapterPosition()));
    }

    public C1418950n1p(AwS601S0100000_22 awS601S0100000_22, C1466950oHF c1466950oHF) {
        this.LL = awS601S0100000_22;
        this.LLILLJJLI = c1466950oHF;
        PorterDuff.Mode mode = PorterDuff.Mode.DARKEN;
        Float fValueOf = Float.valueOf(0.0f);
        this.LLJIJIL = C1697810uHb.LJIIJJI(null, new C443120HZe(-14453, mode, fValueOf), new C443120HZe(-3494401, PorterDuff.Mode.DARKEN, null), new C443120HZe(-32341, PorterDuff.Mode.DARKEN, null), new C443120HZe(-8339201, PorterDuff.Mode.MULTIPLY, null), new C443120HZe(-4260100, PorterDuff.Mode.MULTIPLY, null), new C443120HZe(-57, PorterDuff.Mode.MULTIPLY, null), new C443120HZe(-34439, PorterDuff.Mode.DARKEN, fValueOf));
    }

    public final void LLLFZ(C1418960n1q c1418960n1q, AutoCutThemeData autoCutThemeData) {
        C1418420n0y c1418420n0y;
        C1416070mxB c1416070mxB = this.LLILZLL.get(autoCutThemeData.uuid);
        if (c1416070mxB != null) {
            if (c1416070mxB.LJI) {
                c1418420n0y = LLJILJIL;
            } else {
                c1418420n0y = LLJILJILJ;
            }
            float f = c1416070mxB.LIZLLL;
            float f2 = c1416070mxB.LJ;
            float f3 = c1416070mxB.LJFF;
            C1418420n0y c1418420n0y2 = new C1418420n0y(0.0f, f2, f, f3);
            s sVar = s.LIZ;
            c1418960n1q.R5(c1416070mxB.LIZ, Integer.valueOf((int) (((c1418420n0y2.LIZ * c1418420n0y.LIZ) + (c1418420n0y2.LIZJ * c1418420n0y.LIZJ) + (c1418420n0y2.LIZIZ * c1418420n0y.LIZIZ) + (f3 * c1418420n0y.LIZLLL)) * 100)), c1416070mxB.LIZJ);
            return;
        }
        EnumC1416050mx9 enumC1416050mx9 = EnumC1416050mx9.IDLE;
        int i = C1418960n1q.LLJJL;
        c1418960n1q.R5(enumC1416050mx9, null, false);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [X.0ka7] */
    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLI, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(final C1418960n1q c1418960n1q, int i) {
        float f;
        String string;
        C427300GpE c427300GpE;
        String string2;
        C427300GpE c427300GpE2;
        CharSequence text;
        CharSequence text2;
        C427300GpE c427300GpE3;
        Context context;
        Resources resources;
        int i2;
        float fLIZIZ;
        float fLIZIZ2;
        int i3;
        int i4;
        boolean z;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ListProtector.get(this.LLILLL, i);
        boolean z2 = false;
        if (autoCutThemeData.LIZIZ() == C0MJ9.PLACE_HOLDER) {
            boolean z3 = this.LLJ;
            AwS161S0101000_22 awS161S0101000_22 = new AwS161S0101000_22(this, i, 3);
            c1418960n1q.itemView.setBackground(null);
            RemoteImageView remoteImageView = c1418960n1q.LLILZ;
            if (remoteImageView != null) {
                C786410Ut5.l(remoteImageView, 8);
            }
            c1418960n1q.W5(null);
            if (z3) {
                View view = c1418960n1q.LLJJJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                FrameLayout frameLayout = c1418960n1q.LLJI;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Color.argb(26, 255, 255, 255));
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(5));
                frameLayout.setBackground(gradientDrawable);
                TuxIconView tuxIconView = c1418960n1q.LLJJIJIL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                c1418960n1q.itemView.setClickable(true);
                c1418960n1q.itemView.setFocusable(true);
                TuxIconView tuxIconView2 = c1418960n1q.LLJJIJIL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setClickable(false);
                }
                C786410Ut5.I7(new ACListenerS156S0100000_22(awS161S0101000_22, 12), c1418960n1q.itemView);
                return;
            }
            c1418960n1q.LLJI.setBackground(null);
            View view2 = c1418960n1q.LLJJJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            TuxIconView tuxIconView3 = c1418960n1q.LLJJIJIL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            c1418960n1q.itemView.setClickable(false);
            c1418960n1q.itemView.setFocusable(false);
            C786410Ut5.I7(null, c1418960n1q.itemView);
            return;
        }
        c1418960n1q.LLJJJJLIIL = autoCutThemeData;
        View view3 = c1418960n1q.LLJJJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        c1418960n1q.W5(autoCutThemeData);
        LLLFZ(c1418960n1q, autoCutThemeData);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTemplateLoadingUI , onBindViewHolder: ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        C201955140j.LIZIZ("EditAutoCutScene", C2188811AlT.LIZIZ(sbLIZ));
        int i5 = autoCutThemeData.indexFromSource;
        if (i5 == -1) {
            c1418960n1q.S5(true);
            C1418960n1q.V5("");
            if (i == this.LLILZ) {
                z2 = true;
            }
            c1418960n1q.U5(z2);
            return;
        }
        if (i5 == EnumC1417170myx.PHOTO_MODE_NONE.getIndex()) {
            c1418960n1q.T5(autoCutThemeData.indexFromSource, true);
            C1418960n1q.V5("");
            if (i == this.LLILZ) {
                z2 = true;
            }
            c1418960n1q.U5(z2);
            return;
        }
        if (autoCutThemeData.indexFromSource == EnumC1417170myx.SLIDE_SHOW.getIndex()) {
            c1418960n1q.T5(autoCutThemeData.indexFromSource, true);
            C1418960n1q.V5("");
            if (i == this.LLILZ) {
                z2 = true;
            }
            c1418960n1q.U5(z2);
            return;
        }
        c1418960n1q.S5(false);
        c1418960n1q.T5(autoCutThemeData.indexFromSource, false);
        c1418960n1q.L5(null);
        final String str = autoCutThemeData.coverUrl;
        C13LP.LJJJLZIJ(autoCutThemeData.addFilterToCover, this.LLJIJIL);
        final AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c1418960n1q, 248);
        final ?? r9 = new InterfaceC1320650kTH<InterfaceC1330440kj4>() { // from class: X.0ka7
            @Override // X.InterfaceC1320650kTH
            public final void LIZ(String str2, Throwable th) {
            }

            @Override // X.InterfaceC1320650kTH
            public final void LIZIZ(String str2) {
            }

            @Override // X.InterfaceC1320650kTH
            public final void LIZLLL(String str2, Throwable th) {
            }

            @Override // X.InterfaceC1320650kTH
            public final void LJFF(Object obj, String str2) {
            }

            @Override // X.InterfaceC1320650kTH
            public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str2) {
            }

            @Override // X.InterfaceC1320650kTH
            public final void LJ(String str2, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                awS566S0100000_22.invoke();
            }
        };
        C01GW c01gw = C277570AuJ.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            SmartImageView smartImageView = c1418960n1q.LL;
            if (smartImageView != null) {
                C786410Ut5.LLFF(0, smartImageView);
            }
            RemoteImageView remoteImageView2 = c1418960n1q.LLILZ;
            if (remoteImageView2 != null) {
                remoteImageView2.setCornerRadius(0.0f);
            }
            RemoteImageView remoteImageView3 = c1418960n1q.LLILZ;
            if (remoteImageView3 != null) {
                remoteImageView3.setBackground(null);
            }
            if (str != null && str.length() != 0) {
                final SmartImageView smartImageView2 = c1418960n1q.LL;
                if (smartImageView2 != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJ(smartImageView2);
                    f = 0.0f;
                    c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0n25
                        @Override // X.InterfaceC427850Gq7
                        public final void cm(Uri uri, View view4, Throwable th) {
                            SmartImageView smartImageView3 = c1418960n1q.LL;
                            if (smartImageView3 != null) {
                                smartImageView3.setImageResource(R.drawable.bzi);
                            }
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Ad(Uri uri, View view4, C428600GrK c428600GrK, Animatable animatable) {
                            int i6;
                            if (c428600GrK != null && (i6 = c428600GrK.LIZIZ) > 0) {
                                if (c428600GrK.LIZ / i6 > 0.75f) {
                                    if (((Boolean) C286380BKi.LIZ.getValue()).booleanValue()) {
                                        smartImageView2.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJII);
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            smartImageView2.setRenderEffect(RenderEffect.createBlurEffect(25.0f, 25.0f, Shader.TileMode.CLAMP));
                                        } else {
                                            smartImageView2.setImageDrawable(null);
                                            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str);
                                            c1331670kl3LJIIIZ2.LJJIFFI = new C1332060klg(20, 1, 0);
                                            c1331670kl3LJIIIZ2.LJJ(smartImageView2);
                                            c1331670kl3LJIIIZ2.LJIIJ(new C1466520oGY(c1418960n1q, 0));
                                        }
                                        C1324840ka2.LJIIJJI(c1418960n1q.LLILZ, str, -1, -1, Bitmap.Config.ARGB_8888, r9);
                                        C337180DJs.LIZJ(c1418960n1q.LLILZ);
                                        return;
                                    }
                                    smartImageView2.setImageDrawable(null);
                                    smartImageView2.setBackgroundColor(-16777216);
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        smartImageView2.setRenderEffect(null);
                                    }
                                    C1324840ka2.LJIIJJI(c1418960n1q.LLILZ, str, -1, -1, Bitmap.Config.ARGB_8888, r9);
                                    C337180DJs.LIZJ(c1418960n1q.LLILZ);
                                    return;
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    smartImageView2.setRenderEffect(null);
                                }
                                smartImageView2.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
                                smartImageView2.setAspectRatio(0.75f);
                                C1447470nlp.LIZIZ(smartImageView2, C418440Gaw.LIZIZ(8));
                                RemoteImageView remoteImageView4 = c1418960n1q.LLILZ;
                                if (remoteImageView4 != null) {
                                    C786410Ut5.l(remoteImageView4, 8);
                                }
                                Function0<Unit> function0 = awS566S0100000_22;
                                if (function0 == null) {
                                    return;
                                }
                                function0.invoke();
                            }
                        }
                    });
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
                SmartImageView smartImageView3 = c1418960n1q.LL;
                if (smartImageView3 != null) {
                    smartImageView3.setImageResource(R.drawable.bzi);
                }
            }
        } else {
            f = 0.0f;
            if (str != null && str.length() != 0) {
                C1324840ka2.LJIIJJI(c1418960n1q.LLILZ, str, -1, -1, Bitmap.Config.ARGB_8888, r9);
            } else {
                C1324840ka2.LIZ(c1418960n1q.LLILZ, R.drawable.bzi);
            }
        }
        String str2 = autoCutThemeData.reuseMusicLocalCoverPath;
        if (str2 == null || autoCutThemeData.reuseMusicAlignBranch == 0 || !C306430Bzl.LIZ() || autoCutThemeData.templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
            str2 = null;
        }
        SmartImageView smartImageView4 = c1418960n1q.LLILLJJLI;
        if (smartImageView4 != null) {
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z && new C0VSJ(str2).exists()) {
                C786410Ut5.LLFF(0, smartImageView4);
                C786410Ut5.u5(smartImageView4, C13LZ.LIZLLL(0.6f, f, 1.0f));
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(Uri.fromFile(new C0VSJ(str2)));
                c1331670kl3LJI.LJJ(smartImageView4);
                C786410Ut5.h3(c1331670kl3LJI);
            } else {
                if (smartImageView4.getVisibility() != 8) {
                    C786410Ut5.LLFF(8, smartImageView4);
                }
                if (smartImageView4.getAlpha() != 1.0f) {
                    C786410Ut5.u5(smartImageView4, 1.0f);
                }
            }
        }
        String str3 = autoCutThemeData.lyricCoverOverlayUrl;
        View viewFindViewById = c1418960n1q.itemView.findViewById(R.id.num);
        RemoteImageView remoteImageView4 = (RemoteImageView) c1418960n1q.itemView.findViewById(R.id.nun);
        if (str3 != null && str3.length() != 0) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("url=");
            sbLIZ2.append(str3);
            C1426005i6.LIZ(c1398350mUb, "UI.AutoCut.OverlayCover", C2188811AlT.LIZIZ(sbLIZ2));
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                fLIZIZ = C418440Gaw.LIZIZ(10);
                fLIZIZ2 = C418440Gaw.LIZIZ(8);
                i3 = 69;
                i4 = 92;
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(8);
                fLIZIZ2 = C418440Gaw.LIZIZ(8);
                i3 = 66;
                i4 = 66;
            }
            C0IDA c0ida = new C0IDA(fLIZIZ, 2);
            C0IDA c0ida2 = new C0IDA(fLIZIZ2, 3);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C0EGK.LIZ(i3);
                    layoutParams.height = C0EGK.LIZ(i4);
                } else {
                    layoutParams = null;
                }
                C786410Ut5.W5(viewFindViewById, layoutParams);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(1291845632);
                gradientDrawable2.setCornerRadius(fLIZIZ);
                viewFindViewById.setBackground(gradientDrawable2);
                viewFindViewById.setOutlineProvider(c0ida);
                viewFindViewById.setClipToOutline(true);
            }
            if (remoteImageView4 != null) {
                C786410Ut5.l(remoteImageView4, 0);
                ViewGroup.LayoutParams layoutParams2 = remoteImageView4.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C0EGK.LIZ(66);
                    layoutParams2.height = C0EGK.LIZ(66);
                } else {
                    layoutParams2 = null;
                }
                C786410Ut5.f7(remoteImageView4, layoutParams2);
                remoteImageView4.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
                remoteImageView4.setCornerRadius(fLIZIZ2);
                remoteImageView4.getHierarchy().LJJIII(C1331100kk8.LIZLLL(fLIZIZ2));
                remoteImageView4.setOutlineProvider(c0ida2);
                remoteImageView4.setClipToOutline(true);
                C1324840ka2.LJIIJ(remoteImageView4, str3, -1, -1);
            }
        } else {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (remoteImageView4 != null) {
                C786410Ut5.l(remoteImageView4, 8);
            }
        }
        String string3 = autoCutThemeData.name;
        if (string3 == null) {
            string3 = "";
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_autocut_reuse_music_rename_templates", true, false) && ((i2 = autoCutThemeData.reuseMusicAlignBranch) == 1 || i2 == 2)) {
            string3 = C786410Ut5.j4(C20642515q3.LJI(2131850064), Arrays.copyOf(new Object[]{Integer.valueOf(autoCutThemeData.reuseMusicAlignDisplayIndex)}, 1));
        }
        if (string3.length() == 0 && ((c427300GpE3 = c1418960n1q.LLILZLL) == null || (context = c427300GpE3.getContext()) == null || (resources = context.getResources()) == null || (string3 = resources.getString(2131849995)) == null)) {
            string3 = "";
        }
        C427300GpE c427300GpE4 = c1418960n1q.LLILZLL;
        if (c427300GpE4 != null && (text2 = c427300GpE4.getText()) != null) {
            string = text2.toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string, string3) && (c427300GpE = c1418960n1q.LLILZLL) != null) {
            c427300GpE.setText(string3);
        }
        c1418960n1q.X5();
        String str4 = autoCutThemeData.reuseMusicName;
        if (str4 != null && autoCutThemeData.reuseMusicAlignBranch != 0 && C306430Bzl.LIZ() && autoCutThemeData.templateType != EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue() && str4.length() != 0) {
            TuxTextView tuxTextView = c1418960n1q.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(str4.toUpperCase(Locale.ROOT));
            }
            TuxTextView tuxTextView2 = c1418960n1q.LLILLL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
        } else {
            TuxTextView tuxTextView3 = c1418960n1q.LLILLL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        }
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        if (i == this.LLILZ) {
            z2 = true;
        }
        c1418960n1q.U5(z2);
        String str5 = autoCutThemeData.subtitle;
        if (str5 == null) {
            str5 = "";
        }
        C427300GpE c427300GpE5 = c1418960n1q.LLIZ;
        if (c427300GpE5 != null && (text = c427300GpE5.getText()) != null) {
            string2 = text.toString();
        } else {
            string2 = null;
        }
        if (!Intrinsics.LJFF(string2, str5) && (c427300GpE2 = c1418960n1q.LLIZ) != null) {
            c427300GpE2.setText(str5);
        }
        c1418960n1q.P5(C0MJA.NONE);
        c1418960n1q.P5(autoCutThemeData.iconDisplayType);
        if (this.LLILZIL && i == this.LLILZ) {
            c1418960n1q.N5(true);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1418960n1q c1418960n1q = new C1418960n1q(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.sb, viewGroup, false), this.LLIZ, this.LLIZLLLIL, this.LLILLJJLI);
        try {
            View view = c1418960n1q.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1418960n1q.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1418960n1q.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1418960n1q.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1418960n1q.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1418960n1q.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1418960n1q.class.getName();
        return c1418960n1q;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C1418960n1q c1418960n1q = (C1418960n1q) viewHolder;
        if (list.contains("payload_loading_state")) {
            LLLFZ(c1418960n1q, (AutoCutThemeData) ListProtector.get(this.LLILLL, i));
        } else {
            onBindViewHolder(c1418960n1q, i);
        }
    }
}
