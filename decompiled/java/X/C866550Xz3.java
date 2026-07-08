package X;

import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingTransientExt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Xz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866550Xz3 extends AbstractC866690XzH<InterfaceC866540Xz2> implements InterfaceC866540Xz2 {
    public final String LLILLL;
    public volatile InterfaceC866540Xz2 LLILZ;
    public volatile C0YED LLILZIL;

    @Override // X.InterfaceC866540Xz2
    public final C0Y8T LIZLLL() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getConversation"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return LLLJ(c0yedLIZIZ).LIZLLL();
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("unregister"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJI();
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final List<C0YAE> LJLJJLL() {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryMemberListSync"));
        return c0yedLIZIZ != null ? LLLJ(c0yedLIZIZ).LJLJJLL() : arrayList;
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJJJLL(C914110ZtZ c914110ZtZ) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("reloadMemberList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJJJLL(c914110ZtZ);
        } else {
            c914110ZtZ.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJLIL(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("saveDraft"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJLIL(str);
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLIIIL(InterfaceC863600XuI<List<C0YAE>> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryMemberList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJLIIIL(interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLD(InterfaceC863600XuI interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("setFakeUnreadCount"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLD(interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLILZIL(InterfaceC868050Y3n interfaceC868050Y3n) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("unregister"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLILZIL(interfaceC868050Y3n);
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLIZLLLIL(InterfaceC867020Xzo<String> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("leave"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLIZLLLIL(interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLJLLL(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("manualUpdateConversationSortOrder"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLJLLL(str);
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLLIIIL(InterfaceC868050Y3n interfaceC868050Y3n) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("register"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLLIIIL(interfaceC868050Y3n);
        }
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC866540Xz2 LLLJ(C0YED c0yed) {
        InterfaceC866540Xz2 interfaceC866540Xz2 = this.LLILZ;
        if (interfaceC866540Xz2 != null && this.LLILZIL == c0yed) {
            return interfaceC866540Xz2;
        }
        InterfaceC866540Xz2 interfaceC866540Xz2LJFF = c0yed.LJIJI().LJFF(this.LLILLL);
        this.LLILZ = interfaceC866540Xz2LJFF;
        this.LLILZIL = c0yed;
        return interfaceC866540Xz2LJFF;
    }

    public C866550Xz3(C0YEF c0yef, String str) {
        super(c0yef, "ConversationModelProxy");
        this.LLILLL = str;
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJJJL(C873240YNm c873240YNm, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("addMember"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJJJL(c873240YNm, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJLIIIJLLLLLLLZ(Map<String, String> map, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("upsertCoreExt"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJLIIIJLLLLLLLZ(map, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJLIIJ(Map<String, String> map, Runnable runnable) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateLocal"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJLIIJ(map, runnable);
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJZZIII(Map map, C914110ZtZ c914110ZtZ) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("upsertSettingExt"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJZZIII(map, c914110ZtZ);
        } else {
            c914110ZtZ.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJL(boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("mute"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJL(z, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLJJI(boolean z, InterfaceC867020Xzo<String> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("dissolve"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJLJJI(z, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLJJL(String str, C914150Ztd c914150Ztd) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateName"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJLJJL(str, c914150Ztd);
        } else {
            c914150Ztd.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLJL(String str, InterfaceC863600XuI<List<C0YAE>> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryGroupManagerList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJLJL(str, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLLL(boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("stickTop"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJLLL(z, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final boolean LJZL(String str, Map<String, String> map) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateLocalSync"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return LLLJ(c0yedLIZIZ).LJZL(str, map);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LL(EnumC868530Y5j enumC868530Y5j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("changeCategory"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LL(enumC868530Y5j, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLILL(Map<String, String> map, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateConvCoreInfoExt"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLILL(map, interfaceC863600XuI);
        } else {
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJL(List<Long> list, Map<String, String> map, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("removeMember"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJL(list, map, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJLIIIJL(String str, String str2, InterfaceC863600XuI<C0YAE> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryMember"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJLIIIJL(str, str2, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJZ(BizConvSettingPersistentExt bizConvSettingPersistentExt, BizConvSettingTransientExt bizConvSettingTransientExt, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("upsertBizSettingExt"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJZ(bizConvSettingPersistentExt, bizConvSettingTransientExt, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLIFFJFJJ(boolean z, Map<String, String> map, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("changeNotify"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLIFFJFJJ(z, map, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLLIL(long j, C862540Xsa c862540Xsa, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateMemberInfo"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLLIL(j, c862540Xsa, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLIILII(List<Long> list, int i, Map<String, String> map, InterfaceC863600XuI<BatchUpdateConversationParticipantResponseBody> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchUpdateMemberInfo"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLIILII(list, i, map, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLILLJJLI(List<String> list, List<String> list2, Boolean bool, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("changeConversationTags"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLILLJJLI(list, list2, bool, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLIZ(long j, int i, Map<String, String> map, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateMemberInfo"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLIZ(j, i, map, interfaceC867020Xzo);
        } else {
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLJJJJJIL(String str, String str2, String str3, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateInfo"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLJJJJJIL(str, str2, str3, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }
}
