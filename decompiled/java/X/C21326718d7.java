package X;

import Y.ARunnableS36S1100000_32;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.yoga.m;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import com.tiktok.myna.render.render.MynaTemplateProtocolConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18d7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21326718d7 {
    public final Context LIZ;
    public final String LIZIZ;
    public final C21328418dO LIZJ;
    public AbstractC21333318eB LJI;
    public boolean LJIIIZ;
    public InterfaceC1321110kU1 LJIIL;
    public boolean LJIILIIL;
    public InterfaceC1321540kUi LJIILJJIL;
    public boolean LJIIZILJ;
    public boolean LJJ;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJIIJI;
    public boolean LJJIJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public int LJJJJJL;
    public C21323118cX LJJJLIIL;
    public final C01GW LJJJLZIJ;
    public final C01GW LJJJZ;
    public final C01GW LJJL;
    public final C01GW LJJLI;
    public final C01GW LJJLIIIIJ;
    public final C01GW LJJLIIIJ;
    public final C01GW LJJLIIIJILLIZJL;
    public final C21324518cl LIZLLL = new C21324518cl(this);
    public final C01GW LJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2674));
    public final C21325918cz LJFF = new C21325918cz(this, null);
    public final ConcurrentHashMap<Object, Object> LJII = new ConcurrentHashMap<>();
    public C1168340gVc LJIIIIZZ = C1168340gVc.LIZJ;
    public boolean LJIIJ = true;
    public final int LJIIJJI = 500;
    public final HashMap<String, Object> LJIILL = new HashMap<>();
    public final HashMap<String, String> LJIILLIIL = new HashMap<>();
    public boolean LJIJ = true;
    public boolean LJIJI = true;
    public boolean LJIJJ = true;
    public boolean LJIJJLI = true;
    public boolean LJIL = true;
    public boolean LJJI = true;
    public boolean LJJIFFI = true;
    public final boolean LJJIIJ = true;
    public final boolean LJJIIJZLJL = true;
    public boolean LJJIJ = true;
    public boolean LJJIJIIJIL = true;
    public boolean LJJIJL = true;
    public boolean LJJIJLIJ = true;
    public boolean LJJIL = true;
    public boolean LJJJJ = true;
    public boolean LJJJJL = true;
    public boolean LJJJJLI = true;
    public boolean LJJJJLL = true;
    public final HashMap<Long, C21331518dt> LJJJJZ = new HashMap<>();
    public final ArrayList<InterfaceC21326418d4> LJJJJZI = new ArrayList<>();
    public C09AY LJJJLL = AFwS206S0000000_18.get$arr$(758);

    public final void LIZIZ() {
        LJII(false);
        Iterator<Map.Entry<Long, C21331518dt>> it2 = this.LJJJJZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZ();
        }
        C21323118cX c21323118cX = this.LJJJLIIL;
        if (c21323118cX != null) {
            c21323118cX.LIZIZ();
        }
        C21338218ey c21338218eyLJI = LJI();
        if (c21338218eyLJI != null) {
            C21339818fE c21339818fE = (C21339818fE) c21338218eyLJI.LIZ.getValue();
            if (c21339818fE != null) {
                c21339818fE.LIZIZ();
            }
            C21339818fE c21339818fE2 = (C21339818fE) c21338218eyLJI.LIZIZ.getValue();
            if (c21339818fE2 != null) {
                c21339818fE2.LIZIZ();
            }
            C21339818fE c21339818fE3 = (C21339818fE) c21338218eyLJI.LIZJ.getValue();
            if (c21339818fE3 != null) {
                c21339818fE3.LIZIZ();
            }
        }
        if (this.LJJJIL) {
            ((Map) C428800Gre.LIZ.getValue()).clear();
        }
    }

    public final InterfaceC1321110kU1 LIZLLL() {
        if (this.LJIILIIL) {
            return this.LJIIL;
        }
        if (this.LJIIL == null) {
            C1168270gVV.LIZ.getClass();
            InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(this.LIZIZ);
            this.LJIIL = interfaceC1168310gVZ != null ? interfaceC1168310gVZ.LIZJ() : null;
        }
        return this.LJIIL;
    }

    public final InterfaceC1321540kUi LJ() {
        if (this.LJIILJJIL == null) {
            C1168270gVV.LIZ.getClass();
            InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(this.LIZIZ);
            this.LJIILJJIL = interfaceC1168310gVZ != null ? interfaceC1168310gVZ.LJFF() : null;
        }
        return this.LJIILJJIL;
    }

    public final C21338218ey LJI() {
        return (C21338218ey) this.LJ.getValue();
    }

    public final void LJIIIIZZ() {
        C1168270gVV.LIZ.getClass();
        InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(this.LIZIZ);
        JSONObject jSONObjectLIZIZ = interfaceC1168310gVZ != null ? interfaceC1168310gVZ.LIZIZ() : null;
        boolean z = !((Set) C1163060gN6.LIZ.getValue()).contains(this.LIZIZ);
        boolean z2 = false;
        if (jSONObjectLIZIZ == null) {
            this.LJIIIZ = false;
            this.LJJJJL = z;
            this.LJJJJLI = z;
            return;
        }
        this.LJIJJLI = jSONObjectLIZIZ.optBoolean("enable_lazy_add_children", true);
        this.LJIJ = jSONObjectLIZIZ.optBoolean("enable_line_height", true);
        this.LJJII = jSONObjectLIZIZ.optBoolean("include_font_padding", false);
        this.LJJIJ = jSONObjectLIZIZ.optBoolean("enable_overflow_click", true);
        this.LJJIJLIJ = jSONObjectLIZIZ.optBoolean("enable_new_findview_by_key", true);
        this.LJIIJ = jSONObjectLIZIZ.optBoolean("enable_lynx_typeface", true);
        C1337860kv2.LLJJI = jSONObjectLIZIZ.optBoolean("disable_radius_provider", false);
        this.LJIL = jSONObjectLIZIZ.optBoolean("enable_layout_twice_opt", true);
        this.LJJ = jSONObjectLIZIZ.optBoolean("enable_measure_twice_opt", false);
        this.LJJI = jSONObjectLIZIZ.optBoolean("enable_layout_dirty_opt", true);
        this.LJJIFFI = jSONObjectLIZIZ.optBoolean("enable_layout_param_opt", true);
        this.LJIJI = jSONObjectLIZIZ.optBoolean("enable_style_merge_opt", true);
        this.LJIJJ = jSONObjectLIZIZ.optBoolean("enable_static_style_opt", true);
        this.LJJIJIIJI = jSONObjectLIZIZ.optBoolean("disable_active_style", false);
        this.LJJIII = jSONObjectLIZIZ.optBoolean("use_fallback_line_spacing", false);
        this.LJJIIZ = jSONObjectLIZIZ.optBoolean("use_image_loader_hook", false);
        jSONObjectLIZIZ.optBoolean("enable_image_opt", true);
        jSONObjectLIZIZ.optBoolean("enable_input_format", true);
        this.LJJIJIIJIL = jSONObjectLIZIZ.optBoolean("enable_filter_display_none", true);
        this.LJJIJIL = jSONObjectLIZIZ.optBoolean("force_enable_filter_display_none", false);
        this.LJJIJL = jSONObjectLIZIZ.optBoolean("fix_force_filter_display_none", true);
        this.LJJIL = jSONObjectLIZIZ.optBoolean("enable_text_shrink", true);
        this.LJJIZ = jSONObjectLIZIZ.optBoolean("enable_calculate_expr_perf", true);
        this.LJJJ = jSONObjectLIZIZ.optBoolean("enable_preload_video_player", false);
        this.LJJJI = jSONObjectLIZIZ.optBoolean("enable_precreate_custom_view", false);
        this.LJJJIL = jSONObjectLIZIZ.optBoolean("enable_text_span_cache", true);
        this.LJJJJ = jSONObjectLIZIZ.optBoolean("enable_bind_data_include_layout", true);
        this.LJJJJI = jSONObjectLIZIZ.optBoolean("element_view_reuse_enable", false);
        this.LJJJJJ = jSONObjectLIZIZ.optBoolean("element_view_reuse_only_cache_image_enable", false);
        this.LJJJJIZL = jSONObjectLIZIZ.optBoolean("inline_image_reuse_enable", false);
        this.LJJJJJL = jSONObjectLIZIZ.optInt("reuse_pool_max_count", 0);
        this.LJJIIZI = jSONObjectLIZIZ.optBoolean("drawable_reset_pre_fetch", false);
        this.LJIIIZ = jSONObjectLIZIZ.optBoolean("force_use_mock_data", false);
        boolean zOptBoolean = jSONObjectLIZIZ.optBoolean("enable_leaf_flatten", z);
        this.LJJJJL = zOptBoolean;
        if (zOptBoolean && jSONObjectLIZIZ.optBoolean("enable_level_flatten", z)) {
            z2 = true;
        }
        this.LJJJJLI = z2;
        this.LJJJJLL = jSONObjectLIZIZ.optBoolean("enable_exposure_tracking", true);
    }

    public final C21331518dt LJFF(long j) {
        C21331518dt c21331518dt = this.LJJJJZ.get(Long.valueOf(j));
        if (c21331518dt == null || c21331518dt.LIZJ) {
            C21331518dt c21331518dt2 = new C21331518dt(j);
            this.LJJJJZ.put(Long.valueOf(j), c21331518dt2);
            return c21331518dt2;
        }
        return c21331518dt;
    }

    public final void LJII(boolean z) {
        if (this.LJIIZILJ != z) {
            this.LJIIZILJ = z;
            if (z) {
                C21324518cl c21324518cl = this.LIZLLL;
                if (!c21324518cl.LIZIZ) {
                    c21324518cl.LIZIZ = true;
                    Map<String, AbstractC21324618cm> map = C21325218cs.LIZ;
                    HashMap<String, AbstractC21324618cm> map2 = C21325218cs.LIZIZ.get(c21324518cl.LIZ.LIZIZ);
                    HashMap map3 = new HashMap(C21325218cs.LIZ);
                    if (map2 != null) {
                        map3.putAll(map2);
                    }
                    for (AbstractC21324618cm abstractC21324618cm : map3.values()) {
                        c21324518cl.LIZ(abstractC21324618cm.LIZ(), abstractC21324618cm).LIZ(c21324518cl.LIZ.LJFF, abstractC21324618cm.LIZIZ());
                    }
                    if (!c21324518cl.LIZJ) {
                        c21324518cl.LIZJ = true;
                        Looper.getMainLooper().getQueue().removeIdleHandler((C21324418ck) c21324518cl.LJ.getValue());
                        C786410Ut5.f3((C21324418ck) c21324518cl.LJ.getValue(), Looper.getMainLooper().getQueue());
                        return;
                    }
                    return;
                }
                return;
            }
            C21324518cl c21324518cl2 = this.LIZLLL;
            c21324518cl2.LIZLLL.clear();
            Looper.getMainLooper().getQueue().removeIdleHandler((C21324418ck) c21324518cl2.LJ.getValue());
            c21324518cl2.LIZJ = false;
            c21324518cl2.LIZIZ = false;
        }
    }

    public final View LIZJ(View view, String str) {
        C21325918cz c21325918czLIZIZ;
        AbstractC21333318eB<?> abstractC21333318eB;
        View view2;
        AbstractC21333318eB<?> abstractC21333318eBLJII;
        InterfaceC1338020kvI interfaceC1338020kvILIZLLL = C1337990kvF.LIZLLL(view);
        if (interfaceC1338020kvILIZLLL != null) {
            c21325918czLIZIZ = interfaceC1338020kvILIZLLL.LIZIZ();
        } else {
            c21325918czLIZIZ = null;
        }
        if (this.LJJIJLIJ) {
            if (c21325918czLIZIZ == null || (abstractC21333318eBLJII = c21325918czLIZIZ.LJII(str)) == null) {
                return null;
            }
            return abstractC21333318eBLJII.getView();
        }
        if (c21325918czLIZIZ == null || (abstractC21333318eB = c21325918czLIZIZ.LJIIIZ) == null || (view2 = abstractC21333318eB.getView()) == null) {
            return null;
        }
        return C1337990kvF.LJ(view2, str);
    }

    public C21326718d7(Context context, String str, C21328418dO c21328418dO) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = c21328418dO;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJJJLZIJ = C452501pT.LIZ(enumC452301pR, AFwS223S0000000_32.get$arr$(237));
        this.LJJJZ = C452501pT.LIZ(enumC452301pR, AFwS223S0000000_32.get$arr$(238));
        this.LJJL = C452501pT.LIZ(enumC452301pR, AFwS223S0000000_32.get$arr$(240));
        this.LJJLI = C452501pT.LIZ(enumC452301pR, AFwS223S0000000_32.get$arr$(241));
        this.LJJLIIIIJ = C452501pT.LIZ(enumC452301pR, AFwS223S0000000_32.get$arr$(242));
        this.LJJLIIIJ = C452501pT.LIZ(enumC452301pR, AFwS223S0000000_32.get$arr$(243));
        this.LJJLIIIJILLIZJL = C452501pT.LIZ(enumC452301pR, AFwS223S0000000_32.get$arr$(239));
        LJIIIIZZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.18d8] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.18dA, X.18dD] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final C21326518d5 LIZ(final String str, Map<String, ? extends Object> map, String str2, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, InterfaceC21326118d1 interfaceC21326118d1, final InterfaceC21327318dD interfaceC21327318dD) {
        final C21326918d9 c21326918d9 = new C21326918d9();
        c21326918d9.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c21326918d9.LIZ = true;
        c21326918d9.LIZLLL = Long.valueOf(System.currentTimeMillis());
        C21325918cz c21325918cz = new C21325918cz(this, new C1774720wHe(str, C1942607jE.LIZ(str), "", null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2040));
        AbstractC21333318eB<?> abstractC21333318eBLIZIZ = this.LJI;
        if (abstractC21333318eBLIZIZ == null) {
            abstractC21333318eBLIZIZ = this.LJFF.LIZIZ(new MynaElement("view", null, null, null, null, null, null, null, null, null, null).getType(), true, false);
            this.LJI = abstractC21333318eBLIZIZ;
        }
        C21339618fC c21339618fCLJ = C21333518eD.LJ(abstractC21333318eBLIZIZ, false);
        c21339618fCLJ.setHeight(1.0f);
        c21339618fCLJ.setWidth(1.0f);
        c21339618fCLJ.setMeasureFunction(null);
        C21327718dH c21327718dH = new C21327718dH(this, null, 14);
        m mVar = c21327718dH.LL;
        if (mVar != null) {
            mVar.addChildAt(c21339618fCLJ, mVar.getChildCount());
        }
        c21327718dH.LLJJ = c21339618fCLJ;
        c21327718dH.LLILLJJLI = this.LJIL;
        c21327718dH.LLILLL = this.LJJI;
        C1168400gVi.LIZJ(AFwS278S0000000_32.get$arr$(155));
        final C21326518d5 c21326518d5 = new C21326518d5(c21325918cz, c21327718dH);
        c21326918d9.LJ = Long.valueOf(System.currentTimeMillis());
        c21326918d9.LJFF = Long.valueOf(System.currentTimeMillis());
        C21323118cX c21323118cX = this.LJJJLIIL;
        final ?? r7 = new InterfaceC21327318dD() { // from class: X.18dA
            @Override // X.InterfaceC21327318dD
            public final void LIZLLL() {
                InterfaceC21327318dD interfaceC21327318dD2 = interfaceC21327318dD;
                if (interfaceC21327318dD2 != null) {
                    interfaceC21327318dD2.LIZLLL();
                }
            }

            @Override // X.InterfaceC21327318dD
            public final void LJIJJLI() {
                InterfaceC21327318dD interfaceC21327318dD2 = interfaceC21327318dD;
                if (interfaceC21327318dD2 != null) {
                    interfaceC21327318dD2.LJIJJLI();
                }
            }

            @Override // X.InterfaceC21327318dD
            public final void LIZIZ(Map<String, ? extends Object> map4) {
                InterfaceC21327318dD interfaceC21327318dD2 = interfaceC21327318dD;
                if (interfaceC21327318dD2 != null) {
                    interfaceC21327318dD2.LIZIZ(map4);
                }
            }

            @Override // X.InterfaceC21327318dD
            public final void LIZJ(Map<String, ? extends Object> map4) {
                InterfaceC21327318dD interfaceC21327318dD2 = interfaceC21327318dD;
                if (interfaceC21327318dD2 != null) {
                    interfaceC21327318dD2.LIZJ(map4);
                }
            }

            @Override // X.InterfaceC21327318dD
            public final void LJFF(String str3) {
                InterfaceC21327318dD interfaceC21327318dD2 = interfaceC21327318dD;
                if (interfaceC21327318dD2 != null) {
                    interfaceC21327318dD2.LJFF(str3);
                }
            }

            @Override // X.InterfaceC21327318dD
            public final void LIZ(int i, String str3) {
                InterfaceC21327318dD interfaceC21327318dD2 = interfaceC21327318dD;
                if (interfaceC21327318dD2 != null) {
                    interfaceC21327318dD2.LIZ(i, str3);
                }
            }

            @Override // X.InterfaceC21327318dD
            public final void LJLIIIL(int i, String str3) {
                InterfaceC21327318dD interfaceC21327318dD2 = interfaceC21327318dD;
                if (interfaceC21327318dD2 != null) {
                    interfaceC21327318dD2.LJLIIIL(i, str3);
                }
            }

            @Override // X.InterfaceC21327318dD
            public final void LJ(C21326518d5 c21326518d52, C21327518dF c21327518dF, String str3) {
                C21327718dH c21327718dH2;
                C21326718d7 c21326718d7 = this;
                View view = c21326518d52.LIZIZ;
                c21326718d7.getClass();
                C1168270gVV c1168270gVV = C1168270gVV.LIZ;
                String str4 = c21326718d7.LIZIZ;
                c1168270gVV.getClass();
                if (C1168270gVV.LIZ(str4) && (view instanceof C21327718dH) && (c21327718dH2 = (C21327718dH) view) != null) {
                    StringBuilder sb = new StringBuilder("Myna");
                    if (C1168270gVV.LIZIZ(c21326718d7.LIZIZ)) {
                        sb.append(" - Mock");
                    } else if (c21327518dF.LIZIZ) {
                        sb.append("_preload");
                    } else if (c21327518dF.LIZJ) {
                        sb.append("_predecode");
                    }
                    String string = sb.toString();
                    c21327718dH2.setBackgroundColor("#F01A49");
                    if (C1168270gVV.LIZIZ(c21326718d7.LIZIZ)) {
                        c21327718dH2.setBackgroundColor("#AC2EDF");
                    }
                    if (C1168270gVV.LIZ(c21327718dH2.LLIZLLLIL.LIZIZ)) {
                        C742060T8y.LIZ(new ARunnableS36S1100000_32(c21327718dH2, string, 5));
                    }
                }
                InterfaceC21327318dD interfaceC21327318dD2 = interfaceC21327318dD;
                if (interfaceC21327318dD2 != null) {
                    interfaceC21327318dD2.LJ(c21326518d52, c21327518dF, str3);
                }
            }
        };
        if (c21326518d5.LJFF != EnumC21327118dB.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("myna first render, container status error=");
            sbLIZ.append(c21326518d5.LJFF);
            sbLIZ.append(", url=");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            r7.LIZ(1010, strLIZIZ);
            new C1338670kwL(EnumC1325870kbh.RENDER_ERROR, 1010, strLIZIZ, null, 24).LIZJ(C21323718cd.LIZ(c21326518d5));
        } else {
            c21326518d5.LJFF = EnumC21327118dB.LLILLJJLI;
            c21326518d5.LJI = r7;
            c21326518d5.LJII = map;
            c21326518d5.LJIIJJI = interfaceC21326118d1;
            c21326518d5.LJIIIIZZ = str2;
            c21326518d5.LJIIIZ = map2;
            c21326518d5.LJIIJ = map3;
            Context context = c21326518d5.LIZ.LIZ.LIZ;
            final WeakReference weakReference = new WeakReference(c21326518d5.LIZ.LIZ);
            if (c21323118cX != 0) {
                c21323118cX.LIZ(context, str, c21326918d9, new InterfaceC21323418ca() { // from class: X.18d8
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
                    /* JADX WARN: Type inference failed for: r5v2 */
                    @Override // X.InterfaceC21323418ca
                    public final void LIZ(C21327218dC c21327218dC) {
                        boolean z;
                        boolean z2;
                        String targetSDKVersion;
                        String strLIZIZ2;
                        C21327718dH c21327718dH2;
                        C21327718dH c21327718dH3;
                        C21327718dH c21327718dH4;
                        Object obj;
                        Map<String, Object> customInfo;
                        MynaTemplateProtocolConfig config;
                        C21326718d7 c21326718d7 = weakReference.get();
                        InterfaceC21327318dD interfaceC21327318dD2 = r7;
                        C21326518d5 c21326518d52 = c21327218dC.LIZ;
                        MynaTemplateProtocol mynaTemplateProtocol = c21327218dC.LIZIZ;
                        if (c21327218dC.LIZJ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c21327218dC.LIZLLL) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        long j = c21327218dC.LJ;
                        boolean z3 = c21327218dC.LJFF;
                        String str3 = c21327218dC.LJI;
                        String str4 = c21327218dC.LJII;
                        Long l = c21327218dC.LJIIJ;
                        Long l2 = c21327218dC.LJIIJJI;
                        boolean z4 = z2;
                        boolean z5 = z;
                        C21327518dF c21327518dF = new C21327518dF(c21326518d52, z, z2, j, z3, str3, str4, l, l2);
                        C21326618d6 c21326618d6 = C21326518d5.LJIILIIL;
                        C21326618d6.LIZIZ(c21326518d5.LIZ, mynaTemplateProtocol);
                        String strLJIIJJI = c21326518d5.LIZ.LJIIJJI();
                        MynaTemplateProtocol mynaTemplateProtocol2 = c21327218dC.LIZIZ;
                        if (mynaTemplateProtocol2 == null || (config = mynaTemplateProtocol2.getConfig()) == null || (targetSDKVersion = config.getTargetSDKVersion()) == null) {
                            targetSDKVersion = "";
                        }
                        C1774720wHe c1774720wHe = new C1774720wHe(str, strLJIIJJI, targetSDKVersion, Long.valueOf(c21327218dC.LJ), c21327218dC.LJII, c21327218dC.LJIIIIZZ, c21327218dC.LJIIIZ, c21327218dC.LJIIJ, c21327218dC.LJIIJJI, c21327218dC.LIZLLL, c21327218dC.LIZJ);
                        C1168400gVi.LIZJ(new AwS398S0200000_32(c1774720wHe, c21327518dF, 85));
                        String type = null;
                        if (interfaceC21327318dD2 != null && c21326718d7 != null) {
                            C1168270gVV.LIZ.getClass();
                            if (c21326718d7.LJIIIZ || C1168270gVV.LIZIZ(c21326718d7.LIZIZ)) {
                                Gson gson = new Gson();
                                MynaTemplateProtocol mynaTemplateProtocol3 = c21327218dC.LIZIZ;
                                if (mynaTemplateProtocol3 != null && (customInfo = mynaTemplateProtocol3.getCustomInfo()) != null) {
                                    obj = customInfo.get("mock_data");
                                } else {
                                    obj = null;
                                }
                                String json = GsonProtectorUtils.toJson(gson, obj);
                                if (!Intrinsics.LJFF(json, "null")) {
                                    if (new JSONObject(json).length() > 0) {
                                        interfaceC21327318dD2.LJFF(json);
                                    } else {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("Mock data is empty. URI: ");
                                        sbLIZ2.append(str);
                                        interfaceC21327318dD2.LIZ(1002, C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                }
                            }
                        }
                        C21326918d9 c21326918d92 = c21326918d9;
                        c21326918d92.getClass();
                        if (!z5 && !z4) {
                            c21326918d92.LJI = l;
                            c21326918d92.LJII = l;
                            c21326918d92.LJIIIIZZ = l2;
                        } else {
                            c21326918d92.LJI = c21326918d92.LJFF;
                            c21326918d92.LJIILL = z5;
                            c21326918d92.LJIILLIIL = z4;
                        }
                        c21326918d92.LJIILJJIL = z3;
                        C21326518d5 c21326518d53 = c21327218dC.LIZ;
                        if (c21326518d53 != null) {
                            c21326518d5.LIZLLL(c21326518d53.LIZ, c21326518d53.LIZIZ);
                            C21325918cz c21325918cz2 = c21326518d5.LIZ;
                            if (!Intrinsics.LJFF(c1774720wHe, c21325918cz2.LIZIZ)) {
                                c21325918cz2.LIZIZ = c1774720wHe;
                            }
                            c21326918d9.LJ();
                            C21328118dL c21328118dL = c21326518d5.LIZ.LJIIJ;
                            C21326918d9 c21326918d93 = c21326918d9;
                            c21328118dL.LIZIZ = c21326918d93;
                            c21326918d93.LIZJ(C21323718cd.LIZ(c21326518d5));
                            c21327518dF.LIZ = c21326518d5;
                            c21326518d5.LJFF = EnumC21327118dB.LLILLL;
                            if (interfaceC21327318dD2 != null) {
                                interfaceC21327318dD2.LJ(c21326518d5, c21327518dF, "view_cache");
                            }
                            c21326518d5.LIZIZ();
                            synchronized (c21326618d6) {
                            }
                            return;
                        }
                        if (c21327218dC.LIZIZ != null) {
                            MynaTemplateProtocol mynaTemplateProtocol4 = c21327218dC.LIZIZ;
                            MynaElement uiInfo = mynaTemplateProtocol4.getUiInfo();
                            try {
                                try {
                                    if (!c21327218dC.LIZLLL && !Intrinsics.LJFF(c21327218dC.LJII, "GECKO") && !Intrinsics.LJFF(c21327218dC.LJII, "BUILTIN") && !Intrinsics.LJFF(c21327218dC.LJII, "MEMORY")) {
                                        C21326518d5 c21326518d54 = c21326518d5;
                                        C21325918cz c21325918cz3 = c21326518d54.LIZ;
                                        View view = c21326518d54.LIZIZ;
                                        if (view instanceof C21327718dH) {
                                            c21327718dH4 = (C21327718dH) view;
                                        } else {
                                            c21327718dH4 = null;
                                        }
                                        if (!Intrinsics.LJFF(c1774720wHe, c21325918cz3.LIZIZ)) {
                                            c21325918cz3.LIZIZ = c1774720wHe;
                                        }
                                        c21325918cz3.LJII = c21327218dC.LIZIZ;
                                        if (c21327718dH4 == null) {
                                            return;
                                        }
                                        C21326918d9 c21326918d94 = c21326918d9;
                                        C21326518d5 c21326518d55 = c21326518d5;
                                        C21326518d5 c21326518d56 = c21326518d5;
                                        c21326918d94.getClass();
                                        c21326918d94.LJIIIZ = Long.valueOf(System.currentTimeMillis());
                                        if (uiInfo != null) {
                                            type = uiInfo.getType();
                                        }
                                        AbstractC21333318eB<?> abstractC21333318eBLIZIZ2 = c21325918cz3.LIZIZ(type, true, false);
                                        c21325918cz3.LJIIIZ = abstractC21333318eBLIZIZ2;
                                        c21327718dH4.setRootViewManager$myna_render_release(abstractC21333318eBLIZIZ2);
                                        abstractC21333318eBLIZIZ2.LJJJJJ(uiInfo);
                                        c21326918d94.LJIIJ = Long.valueOf(System.currentTimeMillis());
                                        c21327518dF.LIZ = c21326518d54;
                                        c21326918d94.LJ();
                                        c21325918cz3.LJIIJ.LIZIZ = c21326918d94;
                                        c21326918d94.LIZJ(C21323718cd.LIZ(c21326518d55));
                                        c21326518d56.LJFF = EnumC21327118dB.LLILLL;
                                        if (interfaceC21327318dD2 != null) {
                                            interfaceC21327318dD2.LJ(c21326518d55, c21327518dF, "async_get_template");
                                        }
                                        c21326518d56.LIZIZ();
                                        c21326618d6.LIZJ();
                                        return;
                                    }
                                    if (c21326718d7 == null) {
                                        return;
                                    }
                                    C21326918d9 c21326918d95 = c21326918d9;
                                    c21326918d95.getClass();
                                    c21326918d95.LJIIIZ = Long.valueOf(System.currentTimeMillis());
                                    C21326518d5 c21326518d5LIZ = C21326618d6.LIZ(c21326718d7, mynaTemplateProtocol4, c1774720wHe);
                                    c21326618d6.LIZJ();
                                    c21326518d5.LIZLLL(c21326518d5LIZ.LIZ, c21326518d5LIZ.LIZIZ);
                                    C21326918d9 c21326918d96 = c21326918d9;
                                    c21326918d96.getClass();
                                    c21326918d96.LJIIJ = Long.valueOf(System.currentTimeMillis());
                                    c21327518dF.LIZ = c21326518d5;
                                    c21326918d9.LJ();
                                    C21328118dL c21328118dL2 = c21326518d5.LIZ.LJIIJ;
                                    C21326918d9 c21326918d97 = c21326918d9;
                                    c21328118dL2.LIZIZ = c21326918d97;
                                    c21326918d97.LIZJ(C21323718cd.LIZ(c21326518d5));
                                    c21326518d5.LJFF = EnumC21327118dB.LLILLL;
                                    if (interfaceC21327318dD2 != null) {
                                        interfaceC21327318dD2.LJ(c21326518d5, c21327518dF, "sync_get_template");
                                    }
                                    c21326518d5.LIZIZ();
                                    c21326618d6.LIZJ();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = 0;
                            }
                            TryCatchGuardChecker.doCheck(th);
                            View view2 = c21326518d5.LIZIZ;
                            if ((view2 instanceof C21327718dH) && (c21327718dH3 = (C21327718dH) view2) != null) {
                                c21327718dH3.LJI();
                            }
                            String str5 = "create container exception after get template: " + th.getMessage() + ", template name:" + c21326518d5.LIZ + ".getTemplateName()";
                            if (interfaceC21327318dD2 != null) {
                                interfaceC21327318dD2.LIZ(LSPassThroughRecordSizeConfig.DEFAULT, str5);
                            }
                            c21326518d5.LJFF = EnumC21327118dB.LLILZIL;
                            C21326918d9 c21326918d98 = c21326918d9;
                            c21326918d98.LJIIL = Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT);
                            c21326918d98.LJIILIIL = str5;
                            c21326918d98.LJIIJJI = z3;
                            c21326918d98.LJ();
                            C21328118dL c21328118dL3 = c21326518d5.LIZ.LJIIJ;
                            C21326918d9 c21326918d99 = c21326918d9;
                            c21328118dL3.LIZIZ = c21326918d99;
                            c21326918d99.LIZJ(C21323718cd.LIZ(c21326518d5));
                            new C1338670kwL(EnumC1325870kbh.RENDER_ERROR, LSPassThroughRecordSizeConfig.DEFAULT, str5, null, 24).LIZJ(C21323718cd.LIZ(c21326518d5));
                            return;
                        }
                        View view3 = c21326518d5.LIZIZ;
                        if ((view3 instanceof C21327718dH) && (c21327718dH2 = (C21327718dH) view3) != null) {
                            c21327718dH2.LJI();
                        }
                        if (c21327218dC.LJIIL) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("template loaded, but something's wrong with the content. url=");
                            sbLIZ3.append(str);
                            sbLIZ3.append(", msg=");
                            sbLIZ3.append(c21327218dC.LJIILIIL);
                            sbLIZ3.append(", url=");
                            sbLIZ3.append(str);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                            if (interfaceC21327318dD2 != null) {
                                interfaceC21327318dD2.LIZ(LSPassThroughRecordSizeConfig.DEFAULT, strLIZIZ2);
                            }
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("fetch template failed, code=");
                            sbLIZ4.append((int) z3);
                            sbLIZ4.append(", msg=");
                            sbLIZ4.append(str3);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                            if (interfaceC21327318dD2 != null) {
                                interfaceC21327318dD2.LIZ(1002, strLIZIZ2);
                            }
                        }
                        c21326518d5.LJFF = EnumC21327118dB.LLILZIL;
                        C21326918d9 c21326918d910 = c21326918d9;
                        c21326918d910.LJIIL = 1002;
                        c21326918d910.LJIILIIL = strLIZIZ2;
                        c21326918d910.LJIIJJI = false;
                        c21326918d910.LJ();
                        c21326518d5.LIZ.LJIIJ.LIZIZ = c21326918d9;
                        new C1338670kwL(EnumC1325870kbh.RENDER_ERROR, 1002, strLIZIZ2, null, 24).LIZJ(C21323718cd.LIZ(c21326518d5));
                        c21326918d9.LIZJ(C21323718cd.LIZ(c21326518d5));
                    }
                });
                return c21326518d5;
            }
        }
        return c21326518d5;
    }
}
