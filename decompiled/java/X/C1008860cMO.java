package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.playableloadingformat.AnolePlayableLoadingFormatData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cMO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008860cMO extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public String LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        ((InterfaceC1013940cUa) this.LLJLLL.getValue()).LIZIZ(Intrinsics.LJFF(this.LLJLL, "loadFinish"));
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        System.currentTimeMillis();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        Object c098200Yq;
        Object obj;
        JSONObject jSONObject;
        if (abstractC1003980cEW instanceof C991240bty) {
            Object obj2 = null;
            try {
                Object obj3 = ((C991240bty) abstractC1003980cEW).LIZ.get("iab_load_progress_update");
                if ((obj3 instanceof JSONObject) && (jSONObject = (JSONObject) obj3) != null) {
                    obj = jSONObject.get("progressType");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    c098200Yq = (String) obj;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            String str = (String) obj2;
            if (str != null) {
                if (Intrinsics.LJFF(str, "loadFinish") || Intrinsics.LJFF(str, "loadFail")) {
                    if (!this.LLJLILLLLZIIL) {
                        this.LLJLL = str;
                        C786410Ut5.LJJZZIII(LJIIJJI(), new ARunnableS116S0100000_16(this, 179));
                    }
                    this.LLJLILLLLZIIL = true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0kRY, android.view.View] */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        super.Fk(viewGroup, interfaceC1014340cVE);
        if (this.LLJJIII != null) {
            final Context context = this.LLILZ;
            final int i = 0;
            final AttributeSet attributeSet = null;
            ?? r3 = new ConstraintLayout(context, attributeSet, i) { // from class: X.0kRY
                public C1287400jbe LL;
                public C1295960jpS LLILLJJLI;
                public final C01GW LLILLL;
                public boolean LLILZ;

                private final C1287400jbe getBgShaderView() {
                    KeyEvent.Callback callbackFindViewById = this.LL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.bxk);
                        this.LL = (C1287400jbe) callbackFindViewById;
                    }
                    return (C1287400jbe) callbackFindViewById;
                }

                private final C1295960jpS getLoadingIcon() {
                    KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.lrb);
                        this.LLILLJJLI = (C1295960jpS) callbackFindViewById;
                    }
                    return (C1295960jpS) callbackFindViewById;
                }

                private final InterfaceC1013940cUa getPlayableLogService() {
                    return (InterfaceC1013940cUa) this.LLILLL.getValue();
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
                    Unit unit;
                    super.onAttachedToWindow();
                    try {
                        if (!this.LLILZ) {
                            this.LLILZ = true;
                            C1287400jbe bgShaderView = getBgShaderView();
                            if (bgShaderView != null) {
                                bgShaderView.LIZJ();
                            }
                        }
                        C1295960jpS loadingIcon = getLoadingIcon();
                        if (loadingIcon != null) {
                            loadingIcon.playAnimation();
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    getPlayableLogService().LJII();
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
                    Unit unit;
                    try {
                        C1295960jpS loadingIcon = getLoadingIcon();
                        if (loadingIcon != null) {
                            loadingIcon.cancelAnimation();
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    super.onDetachedFromWindow();
                }

                public final void setData(AnolePlayableLoadingFormatData anolePlayableLoadingFormatData) {
                    Integer numLIZ;
                    Integer numLIZ2;
                    Integer numLIZ3;
                    Integer numLIZ4;
                    Integer numLIZ5;
                    C1287400jbe bgShaderView = getBgShaderView();
                    if (bgShaderView != null) {
                        EnumC1287420jbg enumC1287420jbg = EnumC1287420jbg.SpinDiffuse;
                        C1287390jbd c1287390jbd = new C1287390jbd(0.0f, 0.0f, (List) null, (List) null, 0, 0, 0, 0, 0, 0.0f, 0.0f, 4095);
                        if (anolePlayableLoadingFormatData != null) {
                            Float f = anolePlayableLoadingFormatData.speed;
                            if (f != null) {
                                c1287390jbd.LIZ = f.floatValue();
                            }
                            Float f2 = anolePlayableLoadingFormatData.timeOffset;
                            if (f2 != null) {
                                c1287390jbd.LIZIZ = f2.floatValue();
                            }
                            String str = anolePlayableLoadingFormatData.color1;
                            if (str != null && (numLIZ5 = C998460c5c.LIZ(str)) != null) {
                                c1287390jbd.LJFF = numLIZ5.intValue();
                            }
                            String str2 = anolePlayableLoadingFormatData.color2;
                            if (str2 != null && (numLIZ4 = C998460c5c.LIZ(str2)) != null) {
                                c1287390jbd.LJI = numLIZ4.intValue();
                            }
                            String str3 = anolePlayableLoadingFormatData.color3;
                            if (str3 != null && (numLIZ3 = C998460c5c.LIZ(str3)) != null) {
                                c1287390jbd.LJII = numLIZ3.intValue();
                            }
                            String str4 = anolePlayableLoadingFormatData.color4;
                            if (str4 != null && (numLIZ2 = C998460c5c.LIZ(str4)) != null) {
                                c1287390jbd.LJIIIIZZ = numLIZ2.intValue();
                            }
                            String str5 = anolePlayableLoadingFormatData.bgColor;
                            if (str5 != null && (numLIZ = C998460c5c.LIZ(str5)) != null) {
                                c1287390jbd.LJIIIZ = numLIZ.intValue();
                            }
                            if (anolePlayableLoadingFormatData != null) {
                                Float f3 = anolePlayableLoadingFormatData.position1;
                                Float f4 = anolePlayableLoadingFormatData.position2;
                                if (f3 != null && f4 != null) {
                                    c1287390jbd.LIZLLL = C1697810uHb.LJIIJJI(Float.valueOf(f3.floatValue()), Float.valueOf(f4.floatValue()));
                                }
                                if (anolePlayableLoadingFormatData != null) {
                                    Float f5 = anolePlayableLoadingFormatData.scaleX;
                                    Float f6 = anolePlayableLoadingFormatData.scaleY;
                                    if (f5 != null && f6 != null) {
                                        c1287390jbd.LJ = C1697810uHb.LJIIJJI(Float.valueOf(f5.floatValue()), Float.valueOf(f6.floatValue()));
                                    }
                                    if (anolePlayableLoadingFormatData != null) {
                                        Float f7 = anolePlayableLoadingFormatData.lightness;
                                        if (f7 != null) {
                                            c1287390jbd.LIZJ = f7.floatValue();
                                        }
                                        Float f8 = anolePlayableLoadingFormatData.complex;
                                        if (f8 != null) {
                                            c1287390jbd.LJIIJ = f8.floatValue();
                                        }
                                        Float f9 = anolePlayableLoadingFormatData.morph;
                                        if (f9 != null) {
                                            c1287390jbd.LJIIJJI = f9.floatValue();
                                        }
                                    }
                                }
                            }
                        }
                        bgShaderView.LIZ(enumC1287420jbg, c1287390jbd);
                    }
                    C1295960jpS loadingIcon = getLoadingIcon();
                    if (loadingIcon != null) {
                        loadingIcon.setRepeatCount(-1);
                    }
                    C1295960jpS loadingIcon2 = getLoadingIcon();
                    if (loadingIcon2 != null) {
                        loadingIcon2.setAnimation(R.raw.tux_lottie_common_gmpt_playableloading);
                    }
                }

                {
                    super(context, attributeSet, i);
                    this.LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(439));
                    C786410Ut5.Td(C786410Ut5.ne(context), R.layout.q1, this, true);
                    setBackgroundColor(-16777216);
                }
            };
            r3.setData((AnolePlayableLoadingFormatData) this.LLJLIL.getValue());
            this.LLJJIJIL = r3;
        }
    }

    public C1008860cMO(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 797));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(437));
        this.LLJLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(438));
    }
}
