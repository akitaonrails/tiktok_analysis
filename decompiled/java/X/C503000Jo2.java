package X;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.view.assem.SpacePostPreviewAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503000Jo2 extends C09AY implements Function2<UIAssem, C291001Au<? extends SpacePost>, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ SpacePostPreviewAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503000Jo2(View view, SpacePostPreviewAssem spacePostPreviewAssem) {
        super(2);
        this.LL = view;
        this.LLILLJJLI = spacePostPreviewAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends SpacePost> c291001Au) {
        SpacePost spacePost;
        final ArrayList arrayList;
        List<SpacePollOption> list;
        String strValueOf;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends SpacePost> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (spacePost = (SpacePost) c291001Au2.LIZ) != null) {
            View view = this.LL;
            SpacePostPreviewAssem spacePostPreviewAssem = this.LLILLJJLI;
            C786410Ut5.LJLLLLLL(8, view);
            RecyclerView recyclerView = (RecyclerView) uIAssem2.LJJIJL().findViewById(R.id.hui);
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: X.06SY
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
            AssemVMLazy assemVMLazy = spacePostPreviewAssem.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SpacePostPreviewAssem.LLJJIJI;
            assemVMLazy.getValue();
            int i = spacePost.postType;
            if (i == EnumC503090JoB.TEXT.getValue()) {
                arrayList = new ArrayList();
                arrayList.add(new C502910Jnt(spacePost));
                Iterator it2 = C13LP.LL(spacePost.commentList, 3).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C504910Jr7((SpaceCommentItem) it2.next(), spacePost));
                }
                arrayList.add(new C502940Jnw(spacePost));
            } else if (i == EnumC503090JoB.POLL.getValue()) {
                arrayList = new ArrayList();
                arrayList.add(new C503010Jo3(spacePost));
                SpacePoll spacePoll = spacePost.pollInfo;
                if (spacePoll != null && (list = spacePoll.optionList) != null) {
                    int i2 = 1;
                    for (SpacePollOption spacePollOption : list) {
                        if (1 <= i2 && i2 < 27) {
                            strValueOf = String.valueOf((char) (i2 + 64));
                        } else {
                            strValueOf = "?";
                        }
                        arrayList.add(new C503080JoA(spacePost, spacePollOption, strValueOf));
                        i2++;
                    }
                }
                arrayList.add(new C502940Jnw(spacePost));
            }
            AbstractC502430Jn7 abstractC502430Jn7 = new AbstractC502430Jn7(arrayList) { // from class: X.0JnN
                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i3) {
                    return ((AbstractC503810JpL) ListProtector.get(this.LL, i3)).LIZJ().getValue();
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i3) {
                    C502700JnY c502700JnY;
                    if ((viewHolder instanceof C502700JnY) && (c502700JnY = (C502700JnY) viewHolder) != null) {
                        c502700JnY.I5((AbstractC503810JpL) ListProtector.get(this.LL, i3), null);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
                    C502700JnY c502700JnY;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i3 == EnumC503250JoR.TEXT.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hp7, viewGroup, false);
                        c502700JnY = new C502700JnY(viewTd) { // from class: X.0JnQ
                            public final View LL;
                            public final C16F5 LLILLJJLI;
                            public final C16F5 LLILLL;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = (C16F5) viewTd.findViewById(R.id.rj9);
                                this.LLILLL = (C16F5) viewTd.findViewById(R.id.rm0);
                            }

                            @Override // X.C502700JnY
                            public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
                                C502910Jnt c502910Jnt;
                                String str;
                                if ((abstractC503810JpL instanceof C502910Jnt) && (c502910Jnt = (C502910Jnt) abstractC503810JpL) != null) {
                                    C786410Ut5.LLJJJJ(this.LLILLL, 8);
                                    SpacePost spacePost2 = c502910Jnt.LIZ;
                                    C16F5 c16f5 = this.LLILLJJLI;
                                    SpaceTopicCategory spaceTopicCategory = spacePost2.category;
                                    if (spaceTopicCategory == null || (str = spaceTopicCategory.topicCategoryText) == null) {
                                        str = "";
                                    }
                                    C502700JnY.P5(c16f5, "ttlive_sub_space_ic_chat.png", str, spacePost2.text);
                                }
                            }
                        };
                    } else if (i3 == EnumC503250JoR.COMMENT.getValue()) {
                        final View viewTd2 = C786410Ut5.Td(layoutInflaterNe, R.layout.hox, viewGroup, false);
                        c502700JnY = new C502700JnY(viewTd2) { // from class: X.0JnU
                            public final View LL;
                            public final C16F5 LLILLJJLI;
                            public final C16F5 LLILLL;
                            public final C1324720kZq LLILZ;
                            public final C16F5 LLILZIL;
                            public final C16F5 LLILZLL;
                            public final C0KVZ LLIZ;

                            {
                                super(viewTd2);
                                this.LL = viewTd2;
                                this.LLILLJJLI = (C16F5) viewTd2.findViewById(R.id.eaf);
                                this.LLILLL = (C16F5) viewTd2.findViewById(R.id.ecd);
                                C1324720kZq c1324720kZq = (C1324720kZq) viewTd2.findViewById(R.id.e_j);
                                this.LLILZ = c1324720kZq;
                                this.LLILZIL = (C16F5) viewTd2.findViewById(R.id.ea_);
                                this.LLILZLL = (C16F5) viewTd2.findViewById(R.id.eaa);
                                this.LLIZ = (C0KVZ) viewTd2.findViewById(R.id.bqd);
                                c1324720kZq.getHierarchy().LJIJI(0);
                            }

                            @Override // X.C502700JnY
                            public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
                                C504910Jr7 c504910Jr7;
                                if ((abstractC503810JpL instanceof C504910Jr7) && (c504910Jr7 = (C504910Jr7) abstractC503810JpL) != null) {
                                    SpaceCommentItem spaceCommentItem = c504910Jr7.LIZ;
                                    C502700JnY.T5(this.LLILLJJLI, spaceCommentItem);
                                    this.LLILLL.setText(C0KVU.LIZ(spaceCommentItem.userInfo));
                                    C474270Iin.LIZ((int) C497740JfY.LIZIZ(32.0f), spaceCommentItem.userInfo, this.LLILZ);
                                    this.LLILLL.requestLayout();
                                    R5(this.LLILLJJLI, spaceCommentItem);
                                    if (spaceCommentItem.anchorCommented) {
                                        this.LLILZIL.setText("·");
                                        C786410Ut5.LLJJJJ(this.LLILZIL, 0);
                                        C786410Ut5.LLJJJJ(this.LLILZLL, 0);
                                    } else {
                                        C786410Ut5.LLJJJJ(this.LLILZIL, 8);
                                        C786410Ut5.LLJJJJ(this.LLILZLL, 8);
                                    }
                                    if (!spaceCommentItem.anchorCommented) {
                                        C502700JnY.S5(this.LLIZ, spaceCommentItem.badgeList, spaceCommentItem.userInfo);
                                    } else {
                                        C786410Ut5.LLJZ(this.LLIZ, 8);
                                    }
                                }
                            }
                        };
                    } else if (i3 == EnumC503250JoR.POST_BTM_ACTION.getValue()) {
                        final View viewTd3 = C786410Ut5.Td(layoutInflaterNe, R.layout.hov, viewGroup, false);
                        c502700JnY = new C502700JnY(viewTd3) { // from class: X.0JnS
                            public final View LL;
                            public final LiveIconView LLILLJJLI;
                            public final C1324720kZq LLILLL;
                            public final C16F5 LLILZ;
                            public final C16F5 LLILZIL;
                            public final C16F5 LLILZLL;

                            {
                                super(viewTd3);
                                this.LL = viewTd3;
                                this.LLILLJJLI = (LiveIconView) viewTd3.findViewById(R.id.f755mn3);
                                this.LLILLL = (C1324720kZq) viewTd3.findViewById(R.id.a14);
                                this.LLILZ = (C16F5) viewTd3.findViewById(R.id.a12);
                                this.LLILZIL = (C16F5) viewTd3.findViewById(R.id.mnz);
                                this.LLILZLL = (C16F5) viewTd3.findViewById(R.id.ebw);
                            }

                            @Override // X.C502700JnY
                            public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
                                C502940Jnw c502940Jnw;
                                if ((abstractC503810JpL instanceof C502940Jnw) && (c502940Jnw = (C502940Jnw) abstractC503810JpL) != null) {
                                    SpacePost spacePost2 = c502940Jnw.LIZ;
                                    if (spacePost2.userLiked) {
                                        this.LLILLJJLI.setIconAttr(R.attr.dus);
                                        this.LLILLJJLI.setIconTintAttr(R.attr.eu5);
                                    } else {
                                        this.LLILLJJLI.setIconAttr(R.attr.dul);
                                        this.LLILLJJLI.setIconTintAttr(R.attr.ex5);
                                    }
                                    C786410Ut5.LLJJIII(this.LLILLL, 8);
                                    C786410Ut5.LLJJJJ(this.LLILZ, 8);
                                    long j = spacePost2.commentCount;
                                    if (j > 0) {
                                        this.LLILZLL.setText(C474270Iin.LIZIZ(j));
                                    } else {
                                        this.LLILZLL.setText(C497740JfY.LJIJI(2131844322));
                                    }
                                    long j2 = spacePost2.likeCount;
                                    if (j2 > 0) {
                                        this.LLILZIL.setText(C474270Iin.LIZIZ(j2));
                                    } else {
                                        this.LLILZIL.setText(C497740JfY.LJIJI(2131844326));
                                    }
                                }
                            }
                        };
                    } else {
                        c502700JnY = new C502700JnY(new FrameLayout(viewGroup.getContext()));
                    }
                    try {
                        View view2 = c502700JnY.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c502700JnY.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c502700JnY.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(c502700JnY.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i3);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c502700JnY.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c502700JnY.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = c502700JnY.getClass().getName();
                    return c502700JnY;
                }
            };
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(abstractC502430Jn7);
        }
        return Unit.LIZ;
    }
}
