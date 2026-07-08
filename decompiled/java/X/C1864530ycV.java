package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ui.LiveHighlightPagerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.sug.TakoSugListCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.product.TakoProductListAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.userlist.TakoUserListAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugListCardAssem;
import com.ss.android.ugc.aweme.tako.otherpage.share.ui.ShareContentAssem;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ycV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864530ycV extends C0DXR {
    public final int $t;
    public Object l0;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            case 2:
                LIZIZ$2(this, rect, view, recyclerView, c21673919s1);
                break;
            case 3:
                LIZIZ$3(this, rect, view, recyclerView, c21673919s1);
                break;
            case 4:
                LIZIZ$4(this, rect, view, recyclerView, c21673919s1);
                break;
            case 5:
                LIZIZ$5(this, rect, view, recyclerView, c21673919s1);
                break;
            case 6:
                LIZIZ$6(this, rect, view, recyclerView, c21673919s1);
                break;
            case 7:
                LIZIZ$7(this, rect, view, recyclerView, c21673919s1);
                break;
            case 8:
                LIZIZ$8(this, rect, view, recyclerView, c21673919s1);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C1864530ycV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) == ((LiveHighlightPagerCell) c1864530ycV.l0).getPowerList().getState().LJIIIIZZ() - 1) {
            rect.right = (int) C497740JfY.LIZIZ(12.0f);
        }
        rect.left = (int) C497740JfY.LIZIZ(12.0f);
    }

    public static final void LIZIZ$1(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Pair pair;
        Object first;
        Object second;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        } else {
            pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
        }
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoAnswerImageListAssem) c1864530ycV.l0).LLJL.getValue())) {
            first = pair.getSecond();
        } else {
            first = pair.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoAnswerImageListAssem) c1864530ycV.l0).LLJL.getValue())) {
            second = pair.getFirst();
        } else {
            second = pair.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }

    public static final void LIZIZ$2(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Pair pair;
        Object first;
        Object second;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) ((TakoUserListAssem) c1864530ycV.l0).LLJLIL.getValue();
            if (takoChatUIAbility != null) {
                takoChatUIAbility.Gx1();
            }
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJFF()), Integer.valueOf(C1857750yRZ.LJ() / 2));
        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LIZLLL()));
        } else {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2));
        }
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoUserListAssem) c1864530ycV.l0).LLJLILLLLZIIL.getValue())) {
            first = pair.getSecond();
        } else {
            first = pair.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoUserListAssem) c1864530ycV.l0).LLJLILLLLZIIL.getValue())) {
            second = pair.getFirst();
        } else {
            second = pair.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }

    public static final void LIZIZ$3(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        List<? extends InterfaceC1858000yRy> list;
        InterfaceC1858000yRy interfaceC1858000yRy;
        C326880Cre c326880Cre;
        int i;
        int iLIZIZ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ2 = c21673919s1.LIZIZ();
        if (childAdapterPosition >= 0 && (list = ((ShareContentAssem) c1864530ycV.l0).LLJJJJLIIL) != null && childAdapterPosition < list.size()) {
            List<? extends InterfaceC1858000yRy> list2 = ((ShareContentAssem) c1864530ycV.l0).LLJJJJLIIL;
            if (list2 != null) {
                interfaceC1858000yRy = (InterfaceC1858000yRy) ListProtector.get(list2, childAdapterPosition);
            } else {
                interfaceC1858000yRy = null;
            }
            if ((interfaceC1858000yRy instanceof C326880Cre) && (i = (c326880Cre = (C326880Cre) interfaceC1858000yRy).LLILZ) != 0 && i != 1) {
                if (i == 2 || i == 3) {
                    if (c326880Cre.LLILLL.sender.senderType == 1) {
                        iLIZIZ = ((Number) C1918907fP.LIZJ.getValue()).intValue();
                    } else {
                        iLIZIZ = C1918907fP.LIZIZ();
                    }
                    rect.top = iLIZIZ;
                }
            } else {
                rect.top = C1918907fP.LIZIZ();
            }
        } else {
            rect.top = C1918907fP.LIZIZ();
        }
        if (childAdapterPosition == iLIZIZ2 - 1) {
            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            rect.bottom = 0;
        }
    }

    public static final void LIZIZ$4(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int size;
        List<? extends InterfaceC1858000yRy> list;
        InterfaceC1858000yRy interfaceC1858000yRy;
        InterfaceC1858000yRy interfaceC1858000yRy2;
        Message messageLIZ;
        TakoMixFeed takoMixFeedLJIIIZ;
        int i;
        Boolean bool;
        int i2;
        int iLIZIZ;
        TakoMixFeed takoMixFeedLJIIIZ2;
        boolean z;
        String str;
        List<TakoSourceItem> list2;
        String str2;
        int iLIZ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        List<? extends InterfaceC1858000yRy> list3 = ((TakoContentAssem) c1864530ycV.l0).LLLF;
        int iIntValue = 0;
        if (list3 != null) {
            size = list3.size();
        } else {
            size = 0;
        }
        if (((TakoContentAssem) c1864530ycV.l0).LLLIIL != null && childAdapterPosition >= size) {
            return;
        }
        if (C1859620yUa.LIZIZ()) {
            TakoContentAssem takoContentAssem = (TakoContentAssem) c1864530ycV.l0;
            takoContentAssem.getClass();
            InterfaceC1858000yRy interfaceC1858000yRy3 = (InterfaceC1858000yRy) C13LP.LJJJLZIJ(recyclerView.getChildAdapterPosition(view), takoContentAssem.LLLLIIL);
            if (interfaceC1858000yRy3 != null) {
                iLIZ = interfaceC1858000yRy3.getMessageTopMargin();
            } else {
                iLIZ = C1919107fR.LIZ();
            }
            rect.top = iLIZ;
            return;
        }
        TakoContentAssem takoContentAssem2 = (TakoContentAssem) c1864530ycV.l0;
        takoContentAssem2.getClass();
        int childAdapterPosition2 = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition2 >= 0 && (list = takoContentAssem2.LLLF) != null && childAdapterPosition2 < list.size()) {
            List<? extends InterfaceC1858000yRy> list4 = takoContentAssem2.LLLF;
            Object objLJJJLZIJ = null;
            if (list4 != null) {
                interfaceC1858000yRy = (InterfaceC1858000yRy) ListProtector.get(list4, childAdapterPosition2);
            } else {
                interfaceC1858000yRy = null;
            }
            if (interfaceC1858000yRy instanceof C326880Cre) {
                C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
                int i3 = c326880Cre.LLILZ;
                if (i3 != 0 && i3 != 1) {
                    if (i3 != 2 && i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                rect.top = ((Number) C1918907fP.LJII.getValue()).intValue();
                            }
                        } else {
                            TakoMixFeed takoMixFeedLJIIIZ3 = c326880Cre.LLILLL.LJIIIZ();
                            if ((takoMixFeedLJIIIZ3 != null && (str2 = takoMixFeedLJIIIZ3.text) != null && u.LJJIIJZLJL(str2, "<data-inline", false)) || ((takoMixFeedLJIIIZ2 = c326880Cre.LLILLL.LJIIIZ()) != null && (str = takoMixFeedLJIIIZ2.text) != null && u.LJJIIJZLJL(str, "<data-block", false))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            TakoMixFeed takoMixFeedLJIIIZ4 = c326880Cre.LLILLL.LJIIIZ();
                            if ((takoMixFeedLJIIIZ4 != null && (list2 = takoMixFeedLJIIIZ4.sources) != null && !list2.isEmpty()) || !z) {
                                iIntValue = ((Number) C1918907fP.LJII.getValue()).intValue();
                            }
                            rect.top = iIntValue;
                        }
                    } else {
                        if (c326880Cre.LLILLL.sender.senderType == 1) {
                            iLIZIZ = ((Number) C1918907fP.LIZJ.getValue()).intValue();
                        } else {
                            iLIZIZ = C1918907fP.LIZIZ();
                        }
                        rect.top = iLIZIZ;
                    }
                } else {
                    rect.top = C1918907fP.LIZIZ();
                }
                C1856350yPJ.LIZ.getClass();
                if (!C1856350yPJ.LIZ() || (bool = c326880Cre.LLILLJJLI.LIZLLL) == null) {
                    return;
                }
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    i2 = 3;
                } else {
                    i2 = 8;
                }
                rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
                return;
            }
            if (interfaceC1858000yRy instanceof C642530PId) {
                rect.top = ((Number) C1918907fP.LJFF.getValue()).intValue();
                return;
            }
            if (interfaceC1858000yRy instanceof C326960Crm) {
                C326960Crm c326960Crm = (C326960Crm) interfaceC1858000yRy;
                TakoSug takoSug = c326960Crm.LLILLJJLI;
                boolean z2 = takoSug.LJIIJJI;
                boolean z3 = takoSug.isFirstSug;
                List<? extends InterfaceC1858000yRy> list5 = takoContentAssem2.LLLF;
                if (list5 != null) {
                    objLJJJLZIJ = C13LP.LJJJLZIJ(childAdapterPosition2 - 1, list5);
                }
                if (objLJJJLZIJ instanceof C642530PId) {
                    iIntValue = ((Number) C1918907fP.LJ.getValue()).intValue();
                } else if (!z2) {
                    if (C1858070yS5.LIZJ(c326960Crm.LLILLJJLI)) {
                        C14D7 c14d7LIZIZ = C14D6.LIZIZ();
                        if (c14d7LIZIZ == null || (i = c14d7LIZIZ.LJIIIZ) == null) {
                            i = 0;
                        }
                        iIntValue = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
                    } else if (z3) {
                        List<? extends InterfaceC1858000yRy> list6 = takoContentAssem2.LLLF;
                        if (list6 != null && (interfaceC1858000yRy2 = (InterfaceC1858000yRy) C1856050yOp.LIZ(childAdapterPosition2 - 1, list6)) != null && (messageLIZ = C321970Cjj.LIZ(interfaceC1858000yRy2)) != null && (takoMixFeedLJIIIZ = messageLIZ.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 1022) {
                            iIntValue = ((Number) C1918907fP.LJI.getValue()).intValue();
                        } else {
                            iIntValue = ((Number) C1918907fP.LIZLLL.getValue()).intValue();
                        }
                    } else {
                        iIntValue = ((Number) C1918907fP.LJII.getValue()).intValue();
                    }
                }
                rect.top = iIntValue;
                return;
            }
            if (interfaceC1858000yRy instanceof C326940Crk) {
                rect.top = C1918907fP.LIZIZ();
                return;
            } else {
                rect.top = C1918907fP.LIZIZ();
                return;
            }
        }
        rect.top = C1918907fP.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ$5(X.C1864530ycV r5, android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, X.C21673919s1 r9) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1864530ycV.LIZIZ$5(X.0ycV, android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
    }

    public static final void LIZIZ$6(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Integer num;
        C14D7 c14d7LIZIZ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        TakoSugListCardAssem takoSugListCardAssem = (TakoSugListCardAssem) c1864530ycV.l0;
        int iTp = takoSugListCardAssem.tp((C1858010yRz) C631370Opb.LIZ(takoSugListCardAssem));
        if (iTp == 208 && (c14d7LIZIZ = C14D6.LIZIZ()) != null) {
            num = c14d7LIZIZ.LJIIIIZZ;
        } else {
            num = null;
        }
        if (childAdapterPosition > 0 && num != null) {
            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
            return;
        }
        if (((Boolean) ((TakoSugListCardAssem) c1864530ycV.l0).LLLIIIIL.getValue()).booleanValue()) {
            if (childAdapterPosition <= 0 || iTp == 208) {
                return;
            }
            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            return;
        }
        if (childAdapterPosition <= 0) {
            return;
        }
        TakoSugListCardAssem takoSugListCardAssem2 = (TakoSugListCardAssem) c1864530ycV.l0;
        if (!C1697810uHb.LJIIJJI(102, 103, 208).contains(Integer.valueOf(takoSugListCardAssem2.tp((C1858010yRz) C631370Opb.LIZ(takoSugListCardAssem2))))) {
            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            return;
        }
        TakoSugListCardAssem takoSugListCardAssem3 = (TakoSugListCardAssem) c1864530ycV.l0;
        if (takoSugListCardAssem3.tp((C1858010yRz) C631370Opb.LIZ(takoSugListCardAssem3)) != 102) {
            return;
        }
        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    public static final void LIZIZ$7(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition < 0 || (C13LP.LJJJLZIJ(childAdapterPosition, ((DetailMediaGridContentAssem) c1864530ycV.l0).kp().getListItems()) instanceof C345480DgY)) {
            return;
        }
        if ((childAdapterPosition + 1) % ((DetailMediaGridContentAssem) c1864530ycV.l0).lp() != 0) {
            if (recyclerView.getLayoutDirection() == 1) {
                rect.left = ((DetailMediaGridContentAssem) c1864530ycV.l0).LLJJJJLIIL.LIZIZ;
            } else {
                rect.right = ((DetailMediaGridContentAssem) c1864530ycV.l0).LLJJJJLIIL.LIZIZ;
            }
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null && childAdapterPosition < ((adapter.getItemCount() - 1) / ((DetailMediaGridContentAssem) c1864530ycV.l0).lp()) * ((DetailMediaGridContentAssem) c1864530ycV.l0).lp()) {
            rect.bottom = ((DetailMediaGridContentAssem) c1864530ycV.l0).LLJJJJLIIL.LIZJ;
        }
    }

    public static final void LIZIZ$8(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        boolean z;
        int iLIZIZ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition == itemCount - 1) {
            z = true;
        } else {
            z = false;
        }
        if (childAdapterPosition > 0) {
            if (((TakoMiddlePageSugListCardAssem) c1864530ycV.l0).zp().LIZLLL == EnumC2012407uU.OLD_STYLE) {
                C1858430ySf c1858430ySfZp = ((TakoMiddlePageSugListCardAssem) c1864530ycV.l0).zp();
                if (c1858430ySfZp.LIZ && c1858430ySfZp.LJ == EnumC993120bx0.WRAP_CONTENT_LOW) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    C1858430ySf c1858430ySfZp2 = ((TakoMiddlePageSugListCardAssem) c1864530ycV.l0).zp();
                    if (c1858430ySfZp2.LIZ && c1858430ySfZp2.LJ == EnumC993120bx0.FULL_WIDTH) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    }
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            }
            rect.top = iLIZIZ;
        } else {
            rect.top = 0;
        }
        if (z && ((TakoMiddlePageSugListCardAssem) c1864530ycV.l0).zp().LIZIZ) {
            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
    }

    public static final void LIZIZ$9(C1864530ycV c1864530ycV, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Pair pair;
        Object first;
        Object second;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) ((TakoProductListAssem) c1864530ycV.l0).LLJLILLLLZIIL.getValue();
            if (takoChatUIAbility != null) {
                takoChatUIAbility.Gx1();
            }
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJFF()), Integer.valueOf(C1857750yRZ.LJ() / 2));
        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LIZLLL()));
        } else {
            pair = new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2));
        }
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoProductListAssem) c1864530ycV.l0).LLJLL.getValue())) {
            first = pair.getSecond();
        } else {
            first = pair.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (C1857280yQo.LIZ((TakoCardAbility) ((TakoProductListAssem) c1864530ycV.l0).LLJLL.getValue())) {
            second = pair.getFirst();
        } else {
            second = pair.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }
}
