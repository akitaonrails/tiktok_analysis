package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.KeyMoments;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.ReplaceCover;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443030HYv {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZIZ(C0H81 c0h81) {
        String str;
        C13DA c13da = new C13DA();
        if (c0h81 instanceof C0H82) {
            str = "1";
        } else if (c0h81 instanceof C436050H7z) {
            str = "2";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_frame_cover", str);
        if (c0h81 instanceof C436050H7z) {
            c13da.put("frame_details", C13LP.LJJLIIIJ(((C436050H7z) c0h81).LIZ, ",", null, null, 0, null, AFwS236S0000000_6.get$arr$(504), 30));
        }
        return c13da.build();
    }

    public static void LIZJ(InterfaceC1209780haS interfaceC1209780haS) {
        View view;
        IFeedFragmentAbility iFeedFragmentAbilityLIZ;
        final IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        Fragment fragment;
        RootPanelComponent rootPanelComponentLIZJ;
        C0RJN panelContext;
        final C2189821An6 c2189821An6;
        Fragment fragment2;
        RootPanelComponent rootPanelComponentLIZJ2;
        C0RJN panelContext2;
        C2189821An6 c2189821An62;
        Fragment fragment3 = interfaceC1209780haS.getFragment();
        if (fragment3 != null && (view = fragment3.getView()) != null && (iFeedFragmentAbilityLIZ = C443040HYw.LIZ(C1558360qeg.LJ(view, null))) != null && (iViewPagerComponentAbilityMb = iFeedFragmentAbilityLIZ.Mb()) != null && (fragment = interfaceC1209780haS.getFragment()) != null && (rootPanelComponentLIZJ = C1578630rBN.LIZJ(fragment)) != null && (panelContext = rootPanelComponentLIZJ.getPanelContext()) != null && (c2189821An6 = panelContext.LIZJ) != null && (fragment2 = interfaceC1209780haS.getFragment()) != null && (rootPanelComponentLIZJ2 = C1578630rBN.LIZJ(fragment2)) != null && (panelContext2 = rootPanelComponentLIZJ2.getPanelContext()) != null && (c2189821An62 = panelContext2.LIZJ) != null) {
            Float fValueOf = Float.valueOf(c2189821An62.getSeekProgress());
            float fFloatValue = fValueOf.floatValue();
            if (fFloatValue > 0.0f && fFloatValue < 100.0f) {
                final float fFloatValue2 = fValueOf.floatValue();
                if (fFloatValue2 < 1.0f) {
                    fFloatValue2 *= 100;
                }
                iViewPagerComponentAbilityMb.Bv0(new InterfaceC1616070s9l() { // from class: X.0QDt
                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onBeforePageChange() {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i) {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageScrolled(int i, float f, int i2) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageScrolledEnd(int i, float f, int i2) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageSelected(int i, boolean z) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageUnSelected(C0SZ8 c0sz8) {
                    }

                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onScrollToItemStart(int i) {
                    }

                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageSelected(int i) {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
                        IPlayerComponentAbility iPlayerComponentAbilityX32;
                        Aweme awemeLJIIIIZZ;
                        C0SZ8 c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL();
                        if (c0sz8LJLIL != null) {
                            IViewPagerComponentAbility iViewPagerComponentAbility = iViewPagerComponentAbilityMb;
                            C2189821An6 c2189821An63 = c2189821An6;
                            float f = fFloatValue2;
                            iViewPagerComponentAbility.Xl0(this);
                            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C0T0K.LIZ(c0sz8LJLIL);
                            String aid = null;
                            if (interfaceC665370Q7zLIZ != null) {
                                iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, IFeedPanelPlatformAbility.class, null);
                                if (iFeedPanelPlatformAbility != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
                                    aid = awemeLJIIIIZZ.getAid();
                                }
                            } else {
                                iFeedPanelPlatformAbility = null;
                            }
                            if (Intrinsics.LJFF(aid, c2189821An63.getAid()) && iFeedPanelPlatformAbility != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility.x32()) != null) {
                                iPlayerComponentAbilityX32.dO0(f);
                            }
                        }
                    }
                });
            }
        }
    }

    public static void LIZ(SmartRoute smartRoute, Long l) {
        Float fValueOf;
        if (l != null) {
            fValueOf = Float.valueOf(l.longValue());
        } else {
            fValueOf = null;
        }
        smartRoute.withParam("extra_seek_progress", fValueOf);
    }

    public static C0H81 LIZLLL(SearchAwemeInfo searchAwemeInfo, Aweme aweme) {
        boolean z;
        List<SearchKeyFramePoint> list;
        KeyMoments keyMoments;
        List<SearchKeyFramePoint> list2;
        List<ReplaceCover> list3;
        ReplaceCover replaceCover;
        UrlModel urlModel;
        Integer num;
        KeyMoments keyMoments2;
        List<SearchKeyFramePoint> list4;
        KeyMoments keyMoments3;
        List<SearchKeyFramePoint> list5;
        if (C301230BrN.LIZ() && searchAwemeInfo != null) {
            Integer num2 = searchAwemeInfo.intentType;
            int value = EnumC436120H8g.RENDERED_KEYFRAME.getValue();
            if (num2 != null && num2.intValue() == value && (keyMoments3 = searchAwemeInfo.keyMomentList) != null && (list5 = keyMoments3.moments) != null) {
                Iterator<SearchKeyFramePoint> it2 = list5.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ = true;
                }
            }
        }
        C01GW c01gw = C301230BrN.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && C436140H8i.LIZ(searchAwemeInfo, aweme) && searchAwemeInfo != null && (num = searchAwemeInfo.intentType) != null && num.intValue() == 2 && (keyMoments2 = searchAwemeInfo.keyMomentList) != null && (list4 = keyMoments2.moments) != null) {
            return new C436030H7x(list4);
        }
        if (((Number) c01gw.getValue()).intValue() == 2 && searchAwemeInfo != null && (list3 = searchAwemeInfo.replaceCoverList) != null && (replaceCover = (ReplaceCover) C13LP.LJJJLL(list3)) != null && (urlModel = replaceCover.coverUrl) != null) {
            return new C0H82(urlModel);
        }
        if (C1EB1.LIZ() && C436140H8i.LIZ(searchAwemeInfo, aweme) && searchAwemeInfo != null && (keyMoments = searchAwemeInfo.keyMomentList) != null && (list2 = keyMoments.moments) != null) {
            return new C0H7X(list2);
        }
        if (((Boolean) C271120Aju.LIZ.getValue()).booleanValue() && C436140H8i.LIZ(searchAwemeInfo, aweme)) {
            if (searchAwemeInfo == null) {
                return null;
            }
            KeyMoments keyMoments4 = searchAwemeInfo.keyMomentList;
            if (keyMoments4 != null && (list = keyMoments4.moments) != null) {
                return new C436030H7x(list);
            }
        } else if (searchAwemeInfo == null) {
            return null;
        }
        List<ReplaceCover> list6 = searchAwemeInfo.replaceCoverList;
        if (list6 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ReplaceCover replaceCover2 : list6) {
            UrlModel urlModel2 = replaceCover2.coverUrl;
            Integer num3 = replaceCover2.keyMoment;
            if (urlModel2 != null && num3 != null) {
                if (num3.intValue() == -1) {
                    return new C0H82(urlModel2);
                }
                arrayList.add(new C0H80(urlModel2, num3.intValue()));
            }
        }
        if (arrayList.size() != 4) {
            return null;
        }
        return new C436050H7z(arrayList);
    }
}
