package X;

import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.story.ability.StoryInvisibleVideoAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;

/* JADX INFO: renamed from: X.0RGV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RGV {
    public static boolean LIZJ(C0SZ8 c0sz8) {
        C0SZ8 c0sz8LLJLLL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if ((c0sz8 instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryInvisibleVideoAbility.class, null)) != null) {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        } else {
            if ((c0sz8 instanceof C0SZ8) && c0sz8 != null) {
                c0sz8LLJLLL = c0sz8.LLJLLL();
            } else {
                c0sz8LLJLLL = null;
            }
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryInvisibleVideoAbility.class, null);
            }
        }
        StoryInvisibleVideoAbility storyInvisibleVideoAbility = (StoryInvisibleVideoAbility) interfaceC494301wDLIZ2;
        if (storyInvisibleVideoAbility == null) {
            return false;
        }
        storyInvisibleVideoAbility.wG0();
        return true;
    }

    public static void LIZ(C0SZ8 c0sz8, IPlayerComponentAbility iPlayerComponentAbility) {
        C0SZ8 c0sz8LLJLLL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        if (LIZJ(c0sz8)) {
            return;
        }
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if ((c0sz8 instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, FakePlayerAbility.class, null)) != null) {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        } else {
            if ((c0sz8 instanceof C0SZ8) && c0sz8 != null) {
                c0sz8LLJLLL = c0sz8.LLJLLL();
            } else {
                c0sz8LLJLLL = null;
            }
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, FakePlayerAbility.class, null);
            }
        }
        FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) interfaceC494301wDLIZ2;
        if (fakePlayerAbility != null) {
            Aweme awemeLJIIIIZZ = c0sz8.LJIIIIZZ();
            if (awemeLJIIIIZZ == null) {
                awemeLJIIIIZZ = c0sz8.getAweme();
            }
            if (fakePlayerAbility.fH(awemeLJIIIIZZ)) {
                fakePlayerAbility.lv();
                if (iPlayerComponentAbility != null) {
                    iPlayerComponentAbility.LLLLLLLLLL();
                    return;
                }
                return;
            }
        }
        if (iPlayerComponentAbility != null) {
            iPlayerComponentAbility.LLLLLLLLLL();
        }
    }

    public static void LIZIZ(C0SZ8 c0sz8, IPlayerComponentAbility iPlayerComponentAbility) {
        C0SZ8 c0sz8LLJLLL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        if (LIZJ(c0sz8)) {
            return;
        }
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if ((c0sz8 instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, FakePlayerAbility.class, null)) != null) {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        } else {
            if ((c0sz8 instanceof C0SZ8) && c0sz8 != null) {
                c0sz8LLJLLL = c0sz8.LLJLLL();
            } else {
                c0sz8LLJLLL = null;
            }
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, FakePlayerAbility.class, null);
            }
        }
        FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) interfaceC494301wDLIZ2;
        if (fakePlayerAbility != null) {
            Aweme awemeLJIIIIZZ = c0sz8.LJIIIIZZ();
            if (awemeLJIIIIZZ == null) {
                awemeLJIIIIZZ = c0sz8.getAweme();
            }
            if (fakePlayerAbility.fH(awemeLJIIIIZZ)) {
                fakePlayerAbility.D7();
                if (iPlayerComponentAbility != null) {
                    iPlayerComponentAbility.tryResumePlay();
                    return;
                }
                return;
            }
        }
        if (iPlayerComponentAbility != null) {
            iPlayerComponentAbility.tryResumePlay();
        }
    }
}
