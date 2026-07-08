package X;

import Y.ARunnableS15S1100000_10;
import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.nimblecard.tako.config.TemplateConfig;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.linkflow.TakoLinkFlowAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.nimblecard.experiment.TakoNimbleConfig;
import com.ss.android.ugc.aweme.tako.nimblecard.experiment.TakoNimbleConfigData;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol.ITakoNimbleAbility;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS248S0300000_4;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0R3K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R3K {
    public static boolean LIZ;

    public static List LIZ() {
        List<Integer> list = C0R3L.LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            C20039913b3.LIZ.getClass();
            arrayList.add(Integer.valueOf(C20039913b3.LIZIZ(iIntValue, "")));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public static void LIZIZ(Map map) {
        ?? arrayList;
        long jLongValue;
        if (LIZ) {
            return;
        }
        LIZ = true;
        C14NH.LIZ.getClass();
        C14NH.LJIILL();
        List<TakoNimbleConfig> list = ((TakoNimbleConfigData) C0R3L.LIZIZ.getValue()).configList;
        if (list != null) {
            for (TakoNimbleConfig takoNimbleConfig : list) {
                C14NH c14nh = C14NH.LIZ;
                List<Integer> list2 = takoNimbleConfig.cardType;
                String str = takoNimbleConfig.templateKey;
                c14nh.getClass();
                C14NH.LJFF(str, list2, map);
            }
        }
        List<TemplateConfig.Item> list3 = ((TemplateConfig) C0R3T.LIZIZ.getValue()).items;
        if (list3 != null) {
            arrayList = new ArrayList();
            for (TemplateConfig.Item item : list3) {
                TemplateConfig.Item item2 = item;
                if (Intrinsics.LJFF(item2.scene, "tako") && item2.key != null) {
                    arrayList.add(item);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        for (TemplateConfig.Item item3 : arrayList) {
            List<TakoNimbleConfig> list4 = ((TakoNimbleConfigData) C0R3L.LIZIZ.getValue()).configList;
            if (list4 != null) {
                Iterator<TakoNimbleConfig> it2 = list4.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().templateKey, item3.key)) {
                            break;
                        }
                    } else {
                        Long l = item3.minVersion;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        C844470XAv.LIZ.getClass();
                        if (jLongValue <= C844470XAv.LJ()) {
                            C14NH c14nh2 = C14NH.LIZ;
                            String str2 = item3.key;
                            c14nh2.getClass();
                            C14NH.LJFF(str2, C13BV.INSTANCE, map);
                        }
                    }
                }
            }
        }
        C14NH c14nh3 = C14NH.LIZ;
        List listLJIIJJI = C1697810uHb.LJIIJJI(new C14NZ() { // from class: X.0R3P
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "MarkdownText");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.0R3Q
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS196S0000000_10.get$arr$(438);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        NimbleViewProps nimbleViewProps;
                        String str3;
                        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(LIZIZ(), TakoCardAbility.class, null);
                        TemplateData templateData = this.LJIIIZ;
                        Object objLJIIZILJ = (templateData == null || (nimbleViewProps = templateData.props) == null || (str3 = nimbleViewProps.text) == null) ? null : LJIIZILJ(str3);
                        return new C0R37(takoCardAbility, objLJIIZILJ instanceof String ? (String) objLJIIZILJ : null);
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        return C1858870yTN.LJIIIIZZ(context, C1697810uHb.LJIIJJI(0, 0, 0, 0));
                    }
                };
            }
        }, new C14NZ() { // from class: X.0R3R
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "LightMarkdownText");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(NimbleTemplateContext nimbleTemplateContext) {
                return new C20258614Oq(nimbleTemplateContext);
            }
        }, new C14NZ() { // from class: X.14IV
            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return C1858770yTD.LIZ();
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "TakoInteraction");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new C14NT<View>(nimbleTemplateContext) { // from class: X.14IW
                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        return C1858870yTN.LJIIIZ(context, C1697810uHb.LJIIJJI(0, 0, 0, 0), Boolean.FALSE);
                    }
                };
            }
        }, new C14NZ() { // from class: X.0R3N
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "BubbleView");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20254814Ne<C14J4>(nimbleTemplateContext) { // from class: X.14NQ
                    @Override // X.C14NT
                    public final C14O8 LJJII() {
                        return C20256914Nz.LIZ(this, false);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, java.lang.Object] */
                    @Override // X.AbstractC20254814Ne, X.C14NT, X.C14NX
                    public final void LJII(TemplateData templateData) {
                        List listLJIIJJI2;
                        super.LJII(templateData);
                        if (C07ID.LIZ()) {
                            listLJIIJJI2 = C1697810uHb.LJIIJJI(0, 0, 0, 0);
                        } else {
                            listLJIIJJI2 = C1697810uHb.LJIIJJI(12, 0, 0, 0);
                        }
                        ?? view = getView();
                        C19ME c19meLIZ = C1858870yTN.LIZ(null, Integer.valueOf(R.id.bsx), Integer.valueOf(R.id.eva), listLJIIJJI2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
                        view.setLayoutParams(c19meLIZ);
                        ((C14O7) getView()).LL = this.LIZIZ;
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        C14J4 c14j4 = new C14J4(context);
                        c14j4.setId(R.id.ety);
                        return c14j4;
                    }
                };
            }
        }, new C14NZ() { // from class: X.0R3I
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return C13LE.LIZ(TakoLinkFlowAssem.class);
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "TakoLinkFlow");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.0R3G
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS196S0000000_10.get$arr$(437);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        return new C0R3D((TakoCardAbility) C1558520qew.LIZ(LIZIZ(), TakoCardAbility.class, null));
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        return C1858870yTN.LJFF(context, C1697810uHb.LJIIJJI(12, 6, 12, 0));
                    }
                };
            }
        }, new C14NZ() { // from class: X.0R3O
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "TakoContainerSug");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.0yWm
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS216S0000000_27.get$arr$(252);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        return new C1857010yQN((TakoCardAbility) C1558520qew.LIZ(LIZIZ(), TakoCardAbility.class, null));
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        return C1858870yTN.LJII(context);
                    }
                };
            }
        }, new C14NZ() { // from class: X.0R3M
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "TakoBotMarket");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.0yWl
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS204S0000000_16.get$arr$(369);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        return new C1858850yTL((TakoCardAbility) C1558520qew.LIZ(LIZIZ(), TakoCardAbility.class, null));
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        return C1858870yTN.LJI(context);
                    }
                };
            }
        }, new C14NZ() { // from class: X.0R3U
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return C13LE.LIZ(TakoReferenceAssem.class);
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "TakoSourceReference");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.0R3V
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS196S0000000_10.get$arr$(439);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        return new C0R3W((TakoCardAbility) C1558520qew.LIZ(LIZIZ(), TakoCardAbility.class, null));
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        return C1858870yTN.LJIILIIL(context, C1697810uHb.LJIIJJI(12, 12, 12, 0));
                    }
                };
            }
        }, new C14NZ() { // from class: X.0R3J
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "TakoAwemeSourceReference");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.0R3H
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS196S0000000_10.get$arr$(436);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
                    @Override // X.AbstractC20257014Oa
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.InterfaceC1587906Jp LJJIIZI() {
                        /*
                            r5 = this;
                            boolean r0 = X.C07CS.LIZ()
                            r4 = 0
                            r3 = 0
                            if (r0 == 0) goto L5a
                            com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData r0 = r5.LJIIIZ
                            if (r0 == 0) goto L52
                            com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps r0 = r0.props
                            if (r0 == 0) goto L52
                            java.lang.String r0 = r0.sourceReference
                            if (r0 == 0) goto L52
                            java.lang.Object r2 = r5.LJIIZILJ(r0)
                        L18:
                            boolean r0 = r2 instanceof java.util.List
                            if (r0 == 0) goto L4f
                            java.util.List r2 = (java.util.List) r2
                            if (r2 == 0) goto L50
                            boolean r0 = r2.isEmpty()
                            if (r0 != 0) goto L4d
                            java.util.Iterator r1 = r2.iterator()
                        L2a:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L4d
                            java.lang.Object r0 = r1.next()
                            boolean r0 = r0 instanceof java.lang.String
                            if (r0 != 0) goto L2a
                        L38:
                            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
                        L3c:
                            java.lang.Boolean r0 = java.lang.Boolean.TRUE
                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                            if (r0 == 0) goto L54
                            if (r2 != 0) goto L47
                            r2 = r3
                        L47:
                            X.0R2J r0 = new X.0R2J
                            r0.<init>(r2, r3)
                            return r0
                        L4d:
                            r4 = 1
                            goto L38
                        L4f:
                            r2 = r3
                        L50:
                            r1 = r3
                            goto L3c
                        L52:
                            r2 = r3
                            goto L18
                        L54:
                            X.0R2J r0 = new X.0R2J
                            r0.<init>(r3, r3)
                            return r0
                        L5a:
                            com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData r0 = r5.LJIIIZ
                            if (r0 == 0) goto La1
                            com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps r0 = r0.props
                            if (r0 == 0) goto La1
                            java.lang.String r0 = r0.sourceReference
                            if (r0 == 0) goto La1
                            java.lang.Object r2 = r5.LJIIZILJ(r0)
                        L6a:
                            boolean r0 = r2 instanceof java.util.List
                            if (r0 == 0) goto L9e
                            java.util.List r2 = (java.util.List) r2
                            if (r2 == 0) goto L9f
                            boolean r0 = r2.isEmpty()
                            if (r0 != 0) goto L9c
                            java.util.Iterator r1 = r2.iterator()
                        L7c:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L9c
                            java.lang.Object r0 = r1.next()
                            boolean r0 = r0 instanceof java.lang.Integer
                            if (r0 != 0) goto L7c
                        L8a:
                            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
                        L8e:
                            java.lang.Boolean r0 = java.lang.Boolean.TRUE
                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                            if (r0 == 0) goto La3
                            X.0R2J r0 = new X.0R2J
                            r0.<init>(r3, r3)
                            return r0
                        L9c:
                            r4 = 1
                            goto L8a
                        L9e:
                            r2 = r3
                        L9f:
                            r1 = r3
                            goto L8e
                        La1:
                            r2 = r3
                            goto L6a
                        La3:
                            if (r2 != 0) goto La6
                            r2 = r3
                        La6:
                            X.0R2J r0 = new X.0R2J
                            r0.<init>(r3, r2)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0R3H.LJJIIZI():X.06Jp");
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        return C1858870yTN.LJIILIIL(context, C1697810uHb.LJIIJJI(12, 12, 12, 0));
                    }
                };
            }
        }, new C14NZ() { // from class: X.0R3S
            @Override // X.C14NZ
            public final C13IQ LIZIZ() {
                return null;
            }

            @Override // X.C14NZ
            public final void LIZLLL() {
            }

            @Override // X.C14NZ
            public final boolean LIZ(String str3) {
                return Intrinsics.LJFF(str3, "TakoMessageDisclaimer");
            }

            @Override // X.C14NZ
            public final C14NX LIZJ(final NimbleTemplateContext nimbleTemplateContext) {
                return new AbstractC20257014Oa<View>(nimbleTemplateContext) { // from class: X.14IT
                    @Override // X.AbstractC20257014Oa
                    public final Function0<ReusedUIAssem<?>> LJJIIZ() {
                        return AFwS219S0000000_30.get$arr$(225);
                    }

                    @Override // X.AbstractC20257014Oa
                    public final InterfaceC1587906Jp LJJIIZI() {
                        return new InterfaceC1891350zJl() { // from class: X.14IU
                            @Override // X.InterfaceC1891350zJl
                            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                                return null;
                            }

                            @Override // X.InterfaceC1891350zJl
                            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                return Intrinsics.LJFF(interfaceC1891350zJl, this);
                            }

                            @Override // X.InterfaceC1891350zJl
                            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                                return Intrinsics.LJFF(interfaceC1891350zJl, this);
                            }
                        };
                    }

                    @Override // X.C14NT
                    public final View LJJIII(Context context) {
                        return C1858870yTN.LJIIJJI(context, C1697810uHb.LJIIJJI(0, 0, 0, 0), Boolean.FALSE);
                    }
                };
            }
        });
        c14nh3.getClass();
        C14NH.LIZIZ(listLJIIJJI);
        C14NH.LIZ(C1697810uHb.LJIIJJI(new C14NJ() { // from class: X.0R2M
            @Override // X.C14NJ
            public final String getName() {
                return "takoOpenVideo";
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
            @Override // X.C14NJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map<java.lang.String, ? extends java.lang.Object> r22, X.C14NX r23, java.util.Map<java.lang.String, ? extends java.lang.Object> r24, X.C14NF r25) {
                /*
                    r21 = this;
                    r7 = r23
                    com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext r1 = r7.LIZIZ()
                    java.lang.Class<com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility> r0 = com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility.class
                    r4 = 0
                    X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
                    com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility r0 = (com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility) r0
                    if (r0 == 0) goto L8d
                    java.lang.Object r6 = r0.uv2()
                L15:
                    boolean r0 = r6 instanceof X.C1858840yTK
                    if (r0 == 0) goto L8b
                    X.0yTK r6 = (X.C1858840yTK) r6
                L1b:
                    r1 = r22
                    if (r1 == 0) goto L89
                    java.lang.String r0 = "index"
                    java.lang.Object r1 = r1.get(r0)
                L25:
                    boolean r0 = r1 instanceof java.lang.String
                    if (r0 == 0) goto L87
                    java.lang.String r1 = (java.lang.String) r1
                    if (r1 == 0) goto L87
                    java.lang.Object r0 = r7.LJIIZILJ(r1)
                L31:
                    java.lang.Integer r10 = X.C20252814Mk.LIZJ(r0)
                    X.0R2W r11 = X.C0R2W.LIZ
                    android.view.View r12 = r7.getView()
                    r8 = 0
                    if (r6 == 0) goto L85
                    java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r1 = r6.LLJJJJ
                    if (r1 == 0) goto L85
                    if (r10 == 0) goto L83
                    int r0 = r10.intValue()
                L48:
                    java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
                    com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem) r0
                    if (r0 == 0) goto L85
                    java.lang.String r13 = r0.awemeId
                L52:
                    java.util.ArrayList r14 = new java.util.ArrayList
                    r14.<init>()
                    if (r6 == 0) goto La8
                    java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r0 = r6.LLJJJJ
                    if (r0 == 0) goto L93
                    java.util.Iterator r9 = r0.iterator()
                    r1 = 0
                L62:
                    boolean r0 = r9.hasNext()
                    if (r0 == 0) goto L93
                    java.lang.Object r0 = r9.next()
                    int r5 = r1 + 1
                    if (r1 < 0) goto L8f
                    com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem) r0
                    kotlin.Pair r3 = new kotlin.Pair
                    java.lang.String r2 = r0.awemeId
                    long r0 = (long) r1
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    r3.<init>(r2, r0)
                    r14.add(r3)
                    r1 = r5
                    goto L62
                L83:
                    r0 = 0
                    goto L48
                L85:
                    r13 = r4
                    goto L52
                L87:
                    r0 = r4
                    goto L31
                L89:
                    r1 = r4
                    goto L25
                L8b:
                    r6 = r4
                    goto L1b
                L8d:
                    r6 = r4
                    goto L15
                L8f:
                    X.C1697810uHb.LJIJI()
                    throw r4
                L93:
                    java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r0 = r6.LLJJJJ
                    if (r0 == 0) goto La8
                    if (r10 == 0) goto L9d
                    int r8 = r10.intValue()
                L9d:
                    java.lang.Object r0 = X.C13LP.LJJJLZIJ(r8, r0)
                    com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem) r0
                    if (r0 == 0) goto La8
                    com.ss.android.ugc.aweme.feed.model.Aweme r15 = r0.LIZ
                    goto La9
                La8:
                    r15 = r4
                La9:
                    com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext r16 = r7.LIZIZ()
                    if (r6 == 0) goto Lb1
                    java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r4 = r6.LLJJJJ
                Lb1:
                    r18 = 0
                    r20 = 960(0x3c0, float:1.345E-42)
                    r19 = r18
                    r17 = r4
                    X.C0R2W.LIZ(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0R2M.LIZ(java.util.Map, X.14NX, java.util.Map, X.14NF):void");
            }
        }, new C14NJ() { // from class: X.0R2a
            @Override // X.C14NJ
            public final String getName() {
                return "mediaShowMob";
            }

            /* JADX WARN: Removed duplicated region for block: B:111:0x0167  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0198  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x019e  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x01a1  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x01aa A[PHI: r18
              0x01aa: PHI (r18v1 java.lang.Long) = (r18v0 java.lang.Long), (r18v3 java.lang.Long) binds: [B:119:0x01a6, B:84:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
            @Override // X.C14NJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map<java.lang.String, ? extends java.lang.Object> r43, X.C14NX r44, java.util.Map<java.lang.String, ? extends java.lang.Object> r45, X.C14NF r46) {
                /*
                    Method dump skipped, instruction units count: 432
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C689300R2a.LIZ(java.util.Map, X.14NX, java.util.Map, X.14NF):void");
            }
        }, new C14NJ() { // from class: X.0R2b
            @Override // X.C14NJ
            public final String getName() {
                return "mediaClickMob";
            }

            /* JADX WARN: Removed duplicated region for block: B:103:0x0177  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x017a  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x017d  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0186 A[PHI: r17
              0x0186: PHI (r17v1 java.lang.Long) = (r17v0 java.lang.Long), (r17v3 java.lang.Long) binds: [B:107:0x0182, B:75:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
            @Override // X.C14NJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map<java.lang.String, ? extends java.lang.Object> r41, X.C14NX r42, java.util.Map<java.lang.String, ? extends java.lang.Object> r43, X.C14NF r44) {
                /*
                    Method dump skipped, instruction units count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C689310R2b.LIZ(java.util.Map, X.14NX, java.util.Map, X.14NF):void");
            }
        }, new C14NJ() { // from class: X.0R2L
            public ViewOnAttachStateChangeListenerC20604515jv LIZ;
            public NimbleTemplateContext LIZIZ;
            public List<? extends Object> LIZJ;

            @Override // X.C14NJ
            public final String getName() {
                return "bindVideoAnchor";
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
            @X.C14EU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onVideoEvent(X.C737030Svd r8) {
                /*
                    r7 = this;
                    int r1 = r8.LIZ
                    r0 = 66
                    if (r0 != r1) goto L98
                    java.lang.Object r1 = r8.LIZIZ
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
                    r4 = 0
                    if (r0 == 0) goto L98
                    com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
                    if (r1 == 0) goto L98
                    java.lang.String r6 = r1.getAid()
                    if (r6 == 0) goto L98
                    com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext r1 = r7.LIZIZ
                    if (r1 == 0) goto L54
                    java.lang.Class<com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility> r0 = com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility.class
                    X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
                    com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility r0 = (com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility) r0
                    if (r0 == 0) goto L54
                    java.lang.Object r1 = r0.uv2()
                L29:
                    boolean r0 = r1 instanceof X.C1858840yTK
                    if (r0 == 0) goto L52
                    X.0yTK r1 = (X.C1858840yTK) r1
                L2f:
                    r5 = -1
                    if (r1 == 0) goto L99
                    java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r0 = r1.LLJJJJ
                    if (r0 == 0) goto L99
                    java.util.Iterator r2 = r0.iterator()
                    r1 = 0
                L3b:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L56
                    java.lang.Object r0 = r2.next()
                    com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem) r0
                    java.lang.String r0 = r0.awemeId
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
                    if (r0 != 0) goto L57
                    int r1 = r1 + 1
                    goto L3b
                L52:
                    r1 = r4
                    goto L2f
                L54:
                    r1 = r4
                    goto L29
                L56:
                    r1 = -1
                L57:
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    int r0 = r1.intValue()
                    if (r0 <= 0) goto L99
                    int r5 = r1.intValue()
                L65:
                    X.15jv r0 = r7.LIZ
                    if (r0 == 0) goto L72
                    androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                    if (r0 == 0) goto L72
                    r0.scrollToPosition(r5)
                L72:
                    com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext r1 = r7.LIZIZ
                    if (r1 == 0) goto L98
                    java.lang.Class<com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility> r0 = com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility.class
                    X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r4)
                    com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r0 = (com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility) r0
                    if (r0 == 0) goto L98
                    X.13LC r0 = r0.rg1()
                    if (r0 == 0) goto L98
                    X.0sDA r0 = r0.LIZIZ()
                    X.0ybW r0 = (X.C1863920ybW) r0
                    if (r0 == 0) goto L98
                    X.0PHT r0 = r0.LL
                    if (r0 == 0) goto L98
                    r0.LIZJ = r4
                    r0.LIZLLL = r4
                    r0.LJ = r4
                L98:
                    return
                L99:
                    java.util.List<? extends java.lang.Object> r0 = r7.LIZJ
                    if (r0 == 0) goto L98
                    java.util.Iterator r3 = r0.iterator()
                    r2 = 0
                La2:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L65
                    java.lang.Object r1 = r3.next()
                    boolean r0 = r1 instanceof java.util.Map
                    if (r0 == 0) goto Lc0
                    java.util.Map r1 = (java.util.Map) r1
                    java.lang.String r0 = "id"
                    java.lang.Object r0 = r1.get(r0)
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
                    if (r0 == 0) goto Lc0
                    r5 = r2
                    goto L65
                Lc0:
                    int r2 = r2 + 1
                    goto La2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0R2L.onVideoEvent(X.0Svd):void");
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
                Object objLJ;
                Object obj;
                this.LIZIZ = c14nx.LIZIZ();
                View view = c14nx.getView();
                List<? extends Object> list5 = null;
                if ((view instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view) != null) {
                    this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
                    if (map2 != null && (obj = map2.get("awemes")) != null) {
                        objLJ = c14nx.LJ(obj);
                    } else {
                        objLJ = null;
                    }
                    if (objLJ instanceof List) {
                        list5 = (List) objLJ;
                    }
                    this.LIZJ = list5;
                    if (!EventBus.LIZLLL().LJIIJ(this)) {
                        EventBus.LIZLLL().LJIJJ(this);
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LIZ;
                    if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                        viewOnAttachStateChangeListenerC20604515jv2.addOnAttachStateChangeListener(new C0R45(this, 30));
                    }
                }
            }
        }, new C14NJ() { // from class: X.0R27
            @Override // X.C14NJ
            public final String getName() {
                return "takoRefresh";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                String strLJIJJ;
                String str3;
                Object obj = null;
                if (map2 != null) {
                    obj = map2.get("nodeId");
                }
                if (!(obj instanceof String) || (str3 = (String) obj) == null || (strLJIJJ = c14nx.LJIJJ(str3)) == null) {
                    strLJIJJ = "";
                }
                C328930Cux.LIZ(new ARunnableS15S1100000_10(c14nx, strLJIJJ, 3));
            }
        }, new C14NJ() { // from class: X.0R2A
            @Override // X.C14NJ
            public final String getName() {
                return "takoOpenExperienceVideo";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                Object obj;
                String str3;
                String strLJIJJ;
                Object objLJIIZILJ;
                String str4;
                Map<String, String> commonParams;
                String str5;
                String str6;
                String str7;
                String str8;
                Message messageYy1;
                String str9;
                String str10 = null;
                if (map2 != null) {
                    obj = map2.get("aweme_id");
                } else {
                    obj = null;
                }
                if ((obj instanceof String) && (str3 = (String) obj) != null && (strLJIJJ = c14nx.LJIJJ(str3)) != null) {
                    Object obj2 = map2.get("aweme_rank");
                    if ((obj2 instanceof String) && (str9 = (String) obj2) != null) {
                        objLJIIZILJ = c14nx.LJIIZILJ(str9);
                    } else {
                        objLJIIZILJ = null;
                    }
                    String strValueOf = String.valueOf(objLJIIZILJ);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C13MK.LIZLLL(new AwS248S0300000_4((Map) map2, (Map<String, ? extends Object>) linkedHashMap, (Map<String, String>) c14nx, (C14NX) 4));
                    TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, null);
                    if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null) {
                        str4 = messageYy1.uuid;
                    } else {
                        str4 = null;
                    }
                    ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITakoContextAbility.class, null);
                    if (iTakoContextAbility != null) {
                        commonParams = iTakoContextAbility.getCommonParams();
                    } else {
                        commonParams = null;
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c14nx.getView().getContext(), "//aweme/detail");
                    smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, strLJIJJ);
                    if (commonParams != null) {
                        str10 = commonParams.get("enter_from");
                    }
                    String str11 = "";
                    if (str10 == null) {
                        str10 = "";
                    }
                    smartRouteBuildRoute.withParam("enter_from", str10);
                    if (commonParams == null || (str5 = commonParams.get("enter_method")) == null) {
                        str5 = "";
                    }
                    smartRouteBuildRoute.withParam("enter_method", str5);
                    if (commonParams == null || (str6 = commonParams.get("process_id")) == null) {
                        str6 = "";
                    }
                    smartRouteBuildRoute.withParam("process_id", str6);
                    if (commonParams == null || (str7 = commonParams.get("tako_chat_id")) == null) {
                        str7 = "";
                    }
                    smartRouteBuildRoute.withParam("tako_chat_id", str7);
                    if (commonParams == null || (str8 = commonParams.get("tako_session_id")) == null) {
                        str8 = "";
                    }
                    smartRouteBuildRoute.withParam("tako_session_id", str8);
                    if (str4 == null) {
                        str4 = "";
                    }
                    smartRouteBuildRoute.withParam("message_id", str4);
                    smartRouteBuildRoute.withParam("situation", "review");
                    String str12 = (String) linkedHashMap.get("item_unique_id");
                    if (str12 == null) {
                        str12 = "";
                    }
                    smartRouteBuildRoute.withParam("item_unique_id", str12);
                    String str13 = (String) linkedHashMap.get("situation");
                    if (str13 == null) {
                        str13 = "";
                    }
                    smartRouteBuildRoute.withParam("situation", str13);
                    String str14 = (String) linkedHashMap.get("page");
                    if (str14 != null) {
                        str11 = str14;
                    }
                    smartRouteBuildRoute.withParam("page", str11);
                    smartRouteBuildRoute.withParam("card_rank", strValueOf);
                    smartRouteBuildRoute.open();
                }
            }
        }, new C0R2E(), new C14NJ() { // from class: X.0R2F
            @Override // X.C14NJ
            public final String getName() {
                return "takoGetExperientialVideos";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, final C14NX c14nx, final Map<String, ? extends Object> map3, final C14NF c14nf) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
                ITakoNimbleAbility iTakoNimbleAbility;
                final TakoNimbleVM takoNimbleVMFq0;
                Object objLJ;
                List list5;
                Object objLJ2;
                Object obj;
                NimbleTemplateContext nimbleTemplateContextLIZIZ = c14nx.LIZIZ();
                View view = c14nx.getView();
                Object objLJ3 = null;
                if ((view instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view) != null && (iTakoNimbleAbility = (ITakoNimbleAbility) C1558520qew.LIZ(nimbleTemplateContextLIZIZ, ITakoNimbleAbility.class, null)) != null && (takoNimbleVMFq0 = iTakoNimbleAbility.fq0()) != null) {
                    if (map2 != null && (obj = map2.get("aweme_ids")) != null) {
                        objLJ = c14nx.LJ(obj);
                    } else {
                        objLJ = null;
                    }
                    if ((objLJ instanceof List) && (list5 = (List) objLJ) != null) {
                        final ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(String.valueOf(it3.next()));
                        }
                        if (arrayList2.size() <= 3) {
                            return;
                        }
                        Object obj2 = map2.get("index");
                        if (obj2 != null) {
                            objLJ2 = c14nx.LJ(obj2);
                        } else {
                            objLJ2 = null;
                        }
                        Integer numLIZJ = C20252814Mk.LIZJ(objLJ2);
                        if (numLIZJ != null) {
                            final int iIntValue = numLIZJ.intValue();
                            if (!C07CS.LIZ()) {
                                return;
                            }
                            Object obj3 = map2.get("unique_key");
                            if (obj3 != null) {
                                objLJ3 = c14nx.LJ(obj3);
                            }
                            final C329020Cv6 c329020Cv6 = new C329020Cv6(String.valueOf(objLJ3), C2097608Jq.LJIIIIZZ(new Pair("count", "5"), new Pair("video_ids", C688770Qzz.LIZIZ(arrayList2)), new Pair(Scene.SCENE_SERVICE, "21")));
                            C20603715jn c20603715jn = new C20603715jn();
                            c20603715jn.LJIIL = true;
                            viewOnAttachStateChangeListenerC20604515jv.LJIIL(new AbstractC329610Cw3<Integer>(c20603715jn) { // from class: X.0CvF
                                @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
                                public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
                                    if (arrayList2.size() > 3) {
                                        C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, 3, null, 5);
                                        C189200o6.m2constructorimpl(c323380Cm0LJ);
                                        interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
                                    } else {
                                        C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
                                        C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
                                        interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ);
                                    }
                                }

                                @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
                                public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj4) {
                                    int iIntValue2 = ((Number) obj4).intValue();
                                    TakoNimbleVM takoNimbleVM = takoNimbleVMFq0;
                                    C329020Cv6 c329020Cv62 = c329020Cv6;
                                    EnumC328990Cv3 enumC328990Cv3 = EnumC328990Cv3.LOAD_MORE;
                                    C0R2C c0r2c = new C0R2C(c14nx, iIntValue, map3, c14nf);
                                    takoNimbleVM.getClass();
                                    takoNimbleVM.withState(new C329060CvA(takoNimbleVM, enumC328990Cv3, c329020Cv62, iIntValue2, interfaceC1364105Vn, c0r2c));
                                }
                            });
                        }
                    }
                }
            }
        }, new C14NJ() { // from class: X.0R2P
            @Override // X.C14NJ
            public final String getName() {
                return "takoExperienceProsConsClick";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                FragmentManager childFragmentManager;
                int iIntValue;
                Map<String, String> mapLJ;
                ITakoContextAbility iTakoContextAbility;
                Map<String, String> mapLJ2;
                C13LC<C1863850ybP> c13lcT71;
                C1863850ybP c1863850ybP;
                Integer numValueOf;
                Map<String, String> mapLJ3;
                Message messageYy1;
                Map<String, Object> map4;
                C13LC<C1863850ybP> c13lcT712;
                C1863850ybP c1863850ybP2;
                Object objLJ;
                Object objLJ2;
                Fragment fragmentLIZ = C946803n0.LIZ(c14nx.getView());
                if (fragmentLIZ != null && (childFragmentManager = fragmentLIZ.getChildFragmentManager()) != null) {
                    C1ER1 c1er1 = C1ER1.LIZIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (map2 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                        Iterator<T> it3 = map2.entrySet().iterator();
                        while (it3.hasNext()) {
                            Map.Entry entry = (Map.Entry) it3.next();
                            Object key = entry.getKey();
                            Object key2 = entry.getKey();
                            Object value = entry.getValue();
                            if (value != null && (objLJ2 = c14nx.LJ(value)) != null) {
                                linkedHashMap.put(key2, objLJ2);
                            }
                            if (value instanceof Map) {
                                Map map5 = (Map) value;
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(map5.size()));
                                for (Map.Entry entry2 : map5.entrySet()) {
                                    Object key3 = entry2.getKey();
                                    Object value2 = entry2.getValue();
                                    if (value2 != null && (objLJ = c14nx.LJ(value2)) != null) {
                                        value2 = objLJ;
                                    }
                                    linkedHashMap3.put(key3, value2);
                                }
                                linkedHashMap.put(key2, linkedHashMap3);
                            }
                            linkedHashMap2.put(key, Unit.LIZ);
                        }
                    }
                    linkedHashMap.put("request_path", "/aweme/v2/search/loadmore/");
                    Integer numLIZJ = C20252814Mk.LIZJ(linkedHashMap.get("initialIndex"));
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    linkedHashMap.put("initialIndex", Integer.valueOf(iIntValue));
                    ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITakoContextAbility.class, null);
                    if (iTakoContextAbility2 != null && (c13lcT712 = iTakoContextAbility2.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        C13MK.LIZLLL(new AwS248S0300000_4((Map) map2, (Map<String, ? extends Object>) linkedHashMap4, (Map<String, String>) c14nx, (C14NX) 1));
                        Pair[] pairArr = new Pair[5];
                        String str3 = c1863850ybP2.LL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        pairArr[0] = new Pair("enter_from", str3);
                        String str4 = c1863850ybP2.LLILLJJLI;
                        if (str4 == null) {
                            str4 = "";
                        }
                        pairArr[1] = new Pair("enter_method", str4);
                        Object obj = linkedHashMap4.get("item_unique_id");
                        if (obj == null) {
                            obj = "";
                        }
                        pairArr[2] = new Pair("item_unique_id", obj);
                        Object obj2 = linkedHashMap4.get("inside_page_name");
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        pairArr[3] = new Pair("inside_page_name", obj2);
                        pairArr[4] = new Pair("source", "tako");
                        mapLJ = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), linkedHashMap4);
                    } else {
                        mapLJ = C2097608Jq.LJ();
                    }
                    TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, null);
                    if (takoCardAbility != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        C13MK.LIZLLL(new AwS248S0300000_4((Map) map2, (Map<String, ? extends Object>) linkedHashMap5, (Map<String, String>) c14nx, (C14NX) 2));
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                        C13MK.LIZLLL(new AwS248S0300000_4((Map) map2, (Map<String, ? extends Object>) linkedHashMap5, (Map<String, String>) c14nx, (C14NX) 3));
                        Pair[] pairArr2 = new Pair[11];
                        String str5 = c1863850ybP.LL;
                        if (str5 == null) {
                            str5 = "";
                        }
                        pairArr2[0] = new Pair("enter_from", str5);
                        String str6 = c1863850ybP.LLILLJJLI;
                        if (str6 == null) {
                            str6 = "";
                        }
                        pairArr2[1] = new Pair("enter_method", str6);
                        String str7 = c1863850ybP.LLILZIL;
                        if (str7 == null) {
                            str7 = "";
                        }
                        pairArr2[2] = new Pair("process_id", str7);
                        pairArr2[3] = new Pair("message_id", takoCardAbility.Yy1().uuid);
                        pairArr2[4] = new Pair("card_type", "video");
                        pairArr2[5] = new Pair("is_nimble", String.valueOf(C0R2Q.LIZ(Integer.valueOf(takoCardAbility.t70()))));
                        TakoMixFeed takoMixFeedLJIIIZ = takoCardAbility.Yy1().LJIIIZ();
                        if (takoMixFeedLJIIIZ != null) {
                            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
                        } else {
                            numValueOf = null;
                        }
                        pairArr2[6] = new Pair("is_mixed_layout", C0R2X.LIZIZ(numValueOf));
                        Object obj3 = linkedHashMap5.get("item_unique_id");
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        pairArr2[7] = new Pair("item_unique_id", obj3);
                        pairArr2[8] = new Pair("situation", "review");
                        pairArr2[9] = new Pair("page", "review_panel");
                        pairArr2[10] = new Pair("source", "tako");
                        mapLJ2 = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr2), linkedHashMap6);
                    } else {
                        mapLJ2 = C2097608Jq.LJ();
                    }
                    if (C07CS.LIZ()) {
                        Object obj4 = null;
                        TakoCardAbility takoCardAbility2 = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, null);
                        if (takoCardAbility2 != null && (messageYy1 = takoCardAbility2.Yy1()) != null && (map4 = messageYy1.LJIILIIL) != null) {
                            obj4 = map4.get("user_content_list");
                        }
                        if (!(obj4 instanceof Map) || (mapLJ3 = (Map) obj4) == null) {
                            mapLJ3 = C2097608Jq.LJ();
                        }
                    } else {
                        mapLJ3 = C2097608Jq.LJ();
                    }
                    c1er1.LJJJJI(childFragmentManager, linkedHashMap, mapLJ, mapLJ2, mapLJ3);
                }
            }
        }, new C14NJ() { // from class: X.0R29
            @Override // X.C14NJ
            public final String getName() {
                return "takoOpenNimbelVideo";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                Object obj;
                String str3;
                String strLJIJJ;
                Object objLJIIZILJ;
                String str4;
                Map<String, String> commonParams;
                String str5;
                String str6;
                Message messageYy1;
                String str7;
                String str8 = null;
                if (map2 != null) {
                    obj = map2.get("aweme_id");
                } else {
                    obj = null;
                }
                if ((obj instanceof String) && (str3 = (String) obj) != null && (strLJIJJ = c14nx.LJIJJ(str3)) != null) {
                    Object obj2 = map2.get("aweme_rank");
                    if ((obj2 instanceof String) && (str7 = (String) obj2) != null) {
                        objLJIIZILJ = c14nx.LJIIZILJ(str7);
                    } else {
                        objLJIIZILJ = null;
                    }
                    String strValueOf = String.valueOf(objLJIIZILJ);
                    ArrayList arrayList2 = new ArrayList();
                    C13MK.LIZLLL(new AwS248S0300000_4((Map) map2, (Map<String, ? extends Object>) c14nx, (C14NX) arrayList2, (List<Aweme>) 8));
                    if (!arrayList2.isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C13MK.LIZLLL(new AwS248S0300000_4((Map) map2, (Map<String, ? extends Object>) linkedHashMap, (Map<String, String>) c14nx, (C14NX) 9));
                        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoCardAbility.class, null);
                        if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null) {
                            str4 = messageYy1.uuid;
                        } else {
                            str4 = null;
                        }
                        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITakoContextAbility.class, null);
                        if (iTakoContextAbility != null) {
                            commonParams = iTakoContextAbility.getCommonParams();
                        } else {
                            commonParams = null;
                        }
                        Context context = c14nx.getView().getContext();
                        C1603960rqE.LIZ = new C0PN5(arrayList2);
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
                        smartRouteBuildRoute.withParam("video_from", "from_card_nimble_video");
                        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, strLJIJJ);
                        if (commonParams != null) {
                            str8 = commonParams.get("enter_from");
                        }
                        String str9 = "";
                        if (str8 == null) {
                            str8 = "";
                        }
                        smartRouteBuildRoute.withParam("enter_from", str8);
                        if (commonParams == null || (str5 = commonParams.get("enter_method")) == null) {
                            str5 = "";
                        }
                        smartRouteBuildRoute.withParam("enter_method", str5);
                        if (commonParams == null || (str6 = commonParams.get("process_id")) == null) {
                            str6 = "";
                        }
                        smartRouteBuildRoute.withParam("process_id", str6);
                        if (str4 == null) {
                            str4 = "";
                        }
                        smartRouteBuildRoute.withParam("message_id", str4);
                        String str10 = (String) linkedHashMap.get("item_unique_id");
                        if (str10 == null) {
                            str10 = "";
                        }
                        smartRouteBuildRoute.withParam("item_unique_id", str10);
                        String str11 = (String) linkedHashMap.get("situation");
                        if (str11 != null) {
                            str9 = str11;
                        }
                        smartRouteBuildRoute.withParam("situation", str9);
                        smartRouteBuildRoute.withParam("page", "base");
                        smartRouteBuildRoute.withParam("card_rank", strValueOf);
                        smartRouteBuildRoute.open();
                    }
                }
            }
        }, new C14NJ() { // from class: X.14MW
            @Override // X.C14NJ
            public final String getName() {
                return "openInspirations";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                TakoPageContext takoPageContextBD;
                Object obj;
                Object objLIZLLL;
                Uri uri;
                Object obj2;
                Object objLIZLLL2;
                Object obj3 = null;
                TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(c14nx.LIZIZ(), TakoChatUIAbility.class, null);
                ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITakoChatPageAbility.class, null);
                if (iTakoChatPageAbility != null) {
                    takoPageContextBD = iTakoChatPageAbility.BD();
                } else {
                    takoPageContextBD = null;
                }
                if (map2 != null) {
                    obj = map2.get("uri");
                } else {
                    obj = null;
                }
                if ((obj instanceof String) && obj != null) {
                    objLIZLLL = c14nx.LJ(obj);
                } else {
                    objLIZLLL = null;
                }
                if (String.class == Double.class) {
                    objLIZLLL = C20252814Mk.LIZ(objLIZLLL);
                } else if (String.class == Float.class) {
                    objLIZLLL = C20252814Mk.LIZIZ(objLIZLLL);
                } else if (String.class == Integer.class) {
                    objLIZLLL = C20252814Mk.LIZJ(objLIZLLL);
                } else if (String.class == Long.class) {
                    objLIZLLL = C20252814Mk.LIZLLL(objLIZLLL);
                } else if (String.class == String.class) {
                    if (objLIZLLL != null) {
                        objLIZLLL = objLIZLLL.toString();
                    } else {
                        objLIZLLL = null;
                    }
                } else if (String.class != String.class && String.class != Map.class) {
                    if ((objLIZLLL instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            Gson gsonLIZLLL = C1227904rF.LIZLLL();
                            objLIZLLL = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLIZLLL), String.class);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else if (objLIZLLL instanceof List) {
                        try {
                            Type type = new TypeToken<String>() { // from class: X.14MX
                            }.getType();
                            if (List.class.isAssignableFrom(String.class)) {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                objLIZLLL = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLIZLLL), type);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else if ((objLIZLLL instanceof String) && List.class.isAssignableFrom(String.class)) {
                        objLIZLLL = C14P7.LJJ((String) objLIZLLL);
                    }
                }
                if (!(objLIZLLL instanceof String)) {
                    objLIZLLL = null;
                }
                String str3 = (String) objLIZLLL;
                if (str3 != null && str3.length() > 0 && (uri = UriProtector.parse(str3)) != null) {
                    if (map2 != null) {
                        obj2 = map2.get("push_id");
                    } else {
                        obj2 = null;
                    }
                    if ((obj2 instanceof String) && obj2 != null) {
                        objLIZLLL2 = c14nx.LJ(obj2);
                    } else {
                        objLIZLLL2 = null;
                    }
                    if (String.class == Double.class) {
                        objLIZLLL2 = C20252814Mk.LIZ(objLIZLLL2);
                    } else if (String.class == Float.class) {
                        objLIZLLL2 = C20252814Mk.LIZIZ(objLIZLLL2);
                    } else if (String.class == Integer.class) {
                        objLIZLLL2 = C20252814Mk.LIZJ(objLIZLLL2);
                    } else if (String.class == Long.class) {
                        objLIZLLL2 = C20252814Mk.LIZLLL(objLIZLLL2);
                    } else if (String.class == String.class) {
                        if (objLIZLLL2 != null) {
                            objLIZLLL2 = objLIZLLL2.toString();
                        } else {
                            objLIZLLL2 = null;
                        }
                    } else if (String.class != String.class && String.class != Map.class) {
                        if ((objLIZLLL2 instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                            try {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                                objLIZLLL2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLIZLLL2), String.class);
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        } else if (objLIZLLL2 instanceof List) {
                            try {
                                Type type2 = new TypeToken<String>() { // from class: X.14MY
                                }.getType();
                                if (List.class.isAssignableFrom(String.class)) {
                                    C1227904rF.LIZ.getClass();
                                    Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                                    objLIZLLL2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLIZLLL2), type2);
                                }
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                        } else if ((objLIZLLL2 instanceof String) && List.class.isAssignableFrom(String.class)) {
                            objLIZLLL2 = C14P7.LJJ((String) objLIZLLL2);
                        }
                    }
                    if (objLIZLLL2 instanceof String) {
                        obj3 = objLIZLLL2;
                    }
                    String str4 = (String) obj3;
                    if (C1852640yJK.LIZJ(uri) && takoChatUIAbility != null && !takoChatUIAbility.Gx1()) {
                        C1852640yJK.LJFF(c14nx.LIZIZ().LLILZ, uri, takoPageContextBD, str4, 24);
                    }
                    if (C1852640yJK.LIZIZ(uri) && takoChatUIAbility != null && !takoChatUIAbility.Gx1()) {
                        C1852640yJK.LJ(c14nx.LIZIZ().LLILZ, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "template_id"), takoPageContextBD, null, null, str4, C946803n0.LIZ(c14nx.getView()), 24);
                    }
                }
            }
        }, new C14NJ() { // from class: X.14MZ
            @Override // X.C14NJ
            public final String getName() {
                return "sendMessageToTako";
            }

            @Override // X.C14NJ
            public final void LIZ(Map<String, ? extends Object> map2, C14NX c14nx, Map<String, ? extends Object> map3, C14NF c14nf) {
                Object obj;
                Object objLIZLLL;
                Object obj2;
                Object objLIZLLL2;
                int iIntValue;
                Object obj3;
                Object objLIZLLL3;
                Object obj4;
                Map map4;
                Map<String, String> commonParams = null;
                IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(c14nx.LIZIZ(), IMessageAbility.class, null);
                if (iMessageAbility == null) {
                    return;
                }
                if (map2 != null) {
                    obj = map2.get("query");
                } else {
                    obj = null;
                }
                if ((obj instanceof String) && obj != null) {
                    objLIZLLL = c14nx.LJ(obj);
                } else {
                    objLIZLLL = null;
                }
                if (String.class == Double.class) {
                    objLIZLLL = C20252814Mk.LIZ(objLIZLLL);
                } else if (String.class == Float.class) {
                    objLIZLLL = C20252814Mk.LIZIZ(objLIZLLL);
                } else if (String.class == Integer.class) {
                    objLIZLLL = C20252814Mk.LIZJ(objLIZLLL);
                } else if (String.class == Long.class) {
                    objLIZLLL = C20252814Mk.LIZLLL(objLIZLLL);
                } else if (String.class == String.class) {
                    if (objLIZLLL != null) {
                        objLIZLLL = objLIZLLL.toString();
                    } else {
                        objLIZLLL = null;
                    }
                } else if (String.class != String.class && String.class != Map.class) {
                    if ((objLIZLLL instanceof Map) && !Map.class.isAssignableFrom(String.class)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            Gson gsonLIZLLL = C1227904rF.LIZLLL();
                            objLIZLLL = gsonLIZLLL.LIZJ(gsonLIZLLL.LJIJJLI(objLIZLLL), String.class);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else if (objLIZLLL instanceof List) {
                        try {
                            Type type = new TypeToken<String>() { // from class: X.14Mb
                            }.getType();
                            if (List.class.isAssignableFrom(String.class)) {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL2 = C1227904rF.LIZLLL();
                                objLIZLLL = gsonLIZLLL2.LIZLLL(gsonLIZLLL2.LJIJJLI(objLIZLLL), type);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else if ((objLIZLLL instanceof String) && List.class.isAssignableFrom(String.class)) {
                        objLIZLLL = C14P7.LJJ((String) objLIZLLL);
                    }
                }
                if (!(objLIZLLL instanceof String)) {
                    objLIZLLL = null;
                }
                String str3 = (String) objLIZLLL;
                if (map2 != null) {
                    obj2 = map2.get("sendType");
                } else {
                    obj2 = null;
                }
                if ((obj2 instanceof String) && obj2 != null) {
                    objLIZLLL2 = c14nx.LJ(obj2);
                } else {
                    objLIZLLL2 = null;
                }
                if (Integer.class == Double.class) {
                    objLIZLLL2 = C20252814Mk.LIZ(objLIZLLL2);
                } else if (Integer.class == Float.class) {
                    objLIZLLL2 = C20252814Mk.LIZIZ(objLIZLLL2);
                } else if (Integer.class == Integer.class) {
                    objLIZLLL2 = C20252814Mk.LIZJ(objLIZLLL2);
                } else if (Integer.class == Long.class) {
                    objLIZLLL2 = C20252814Mk.LIZLLL(objLIZLLL2);
                } else if (Integer.class == String.class) {
                    if (objLIZLLL2 != null) {
                        objLIZLLL2 = objLIZLLL2.toString();
                    } else {
                        objLIZLLL2 = null;
                    }
                } else if (Integer.class != String.class && Integer.class != Map.class) {
                    if ((objLIZLLL2 instanceof Map) && !Map.class.isAssignableFrom(Integer.class)) {
                        try {
                            C1227904rF.LIZ.getClass();
                            Gson gsonLIZLLL3 = C1227904rF.LIZLLL();
                            objLIZLLL2 = gsonLIZLLL3.LIZJ(gsonLIZLLL3.LJIJJLI(objLIZLLL2), Integer.class);
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    } else if (objLIZLLL2 instanceof List) {
                        try {
                            Type type2 = new TypeToken<Integer>() { // from class: X.14Mc
                            }.getType();
                            if (List.class.isAssignableFrom(Integer.class)) {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL4 = C1227904rF.LIZLLL();
                                objLIZLLL2 = gsonLIZLLL4.LIZLLL(gsonLIZLLL4.LJIJJLI(objLIZLLL2), type2);
                            }
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    } else if ((objLIZLLL2 instanceof String) && List.class.isAssignableFrom(Integer.class)) {
                        objLIZLLL2 = C14P7.LJJ((String) objLIZLLL2);
                    }
                }
                if (!(objLIZLLL2 instanceof Integer)) {
                    objLIZLLL2 = null;
                }
                Integer num = (Integer) objLIZLLL2;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (str3 != null && str3.length() != 0) {
                    if (map2 != null) {
                        obj3 = map2.get("extraParamMap");
                    } else {
                        obj3 = null;
                    }
                    if ((obj3 instanceof String) && obj3 != null) {
                        objLIZLLL3 = c14nx.LJ(obj3);
                    } else {
                        objLIZLLL3 = null;
                    }
                    if (Map.class == Double.class) {
                        objLIZLLL3 = C20252814Mk.LIZ(objLIZLLL3);
                    } else if (Map.class == Float.class) {
                        objLIZLLL3 = C20252814Mk.LIZIZ(objLIZLLL3);
                    } else if (Map.class == Integer.class) {
                        objLIZLLL3 = C20252814Mk.LIZJ(objLIZLLL3);
                    } else if (Map.class == Long.class) {
                        objLIZLLL3 = C20252814Mk.LIZLLL(objLIZLLL3);
                    } else if (Map.class == String.class) {
                        if (objLIZLLL3 != null) {
                            objLIZLLL3 = objLIZLLL3.toString();
                        } else {
                            objLIZLLL3 = null;
                        }
                    } else if (Map.class != String.class && Map.class != Map.class) {
                        if ((objLIZLLL3 instanceof Map) && !Map.class.isAssignableFrom(Map.class)) {
                            try {
                                C1227904rF.LIZ.getClass();
                                Gson gsonLIZLLL5 = C1227904rF.LIZLLL();
                                objLIZLLL3 = gsonLIZLLL5.LIZJ(gsonLIZLLL5.LJIJJLI(objLIZLLL3), Map.class);
                            } catch (Exception e5) {
                                TryCatchGuardChecker.doCheck(e5);
                            }
                        } else if (objLIZLLL3 instanceof List) {
                            try {
                                Type type3 = new TypeToken<Map<?, ?>>() { // from class: X.14Ma
                                }.getType();
                                if (List.class.isAssignableFrom(Map.class)) {
                                    C1227904rF.LIZ.getClass();
                                    Gson gsonLIZLLL6 = C1227904rF.LIZLLL();
                                    objLIZLLL3 = gsonLIZLLL6.LIZLLL(gsonLIZLLL6.LJIJJLI(objLIZLLL3), type3);
                                }
                            } catch (Exception e6) {
                                TryCatchGuardChecker.doCheck(e6);
                            }
                        } else if ((objLIZLLL3 instanceof String) && List.class.isAssignableFrom(Map.class)) {
                            objLIZLLL3 = C14P7.LJJ((String) objLIZLLL3);
                        }
                    }
                    if (!(objLIZLLL3 instanceof Map)) {
                        objLIZLLL3 = null;
                    }
                    Map arrayMap = (Map) objLIZLLL3;
                    if (arrayMap == null) {
                        arrayMap = new ArrayMap();
                    }
                    Set<Map.Entry> setEntrySet = arrayMap.entrySet();
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (Map.Entry entry : setEntrySet) {
                        Pair pair = new Pair(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    linkedHashMap2.put("is_resend", CardStruct.IStatusCode.DEFAULT);
                    linkedHashMap2.put("message_type", "text");
                    if (map2 != null) {
                        obj4 = map2.get("extraRequestParamsMap");
                    } else {
                        obj4 = null;
                    }
                    if (obj4 instanceof Map) {
                        map4 = (Map) obj4;
                    } else {
                        map4 = null;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    if (map4 != null) {
                        for (Map.Entry entry2 : map4.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            if (value != null) {
                                linkedHashMap3.put(String.valueOf(key), value);
                            }
                        }
                    }
                    ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(c14nx.LIZIZ(), ITakoContextAbility.class, null);
                    if (iTakoContextAbility != null) {
                        commonParams = iTakoContextAbility.getCommonParams();
                    }
                    iMessageAbility.Rl2(str3, true, EnumC1858090yS7.CUSTOM, commonParams, linkedHashMap2, new LinkedHashMap(), null, null, "", 0, null, 0, iIntValue, null, null, UUID.randomUUID().toString(), null, null);
                }
            }
        }));
    }
}
