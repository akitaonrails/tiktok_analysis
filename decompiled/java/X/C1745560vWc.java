package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewStyle;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0vWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745560vWc extends AbstractC21673619ry<AbstractViewOnClickListenerC1745630vWj> {
    public List<CandInputData> LL;
    public ViewStyle LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public InterfaceC1743730vTf LLILZIL;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<CandInputData> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        CandInputData candInputData;
        List<ViewItem> list;
        Integer num;
        List<CandInputData> list2 = this.LL;
        CandInputData candInputData2 = null;
        if (list2 != null) {
            candInputData2 = (CandInputData) ListProtector.get(list2, i);
        }
        if (candInputData2 != null && (num = candInputData2.type) != null && num.intValue() == 6) {
            return 3;
        }
        List<CandInputData> list3 = this.LL;
        if (list3 == null || (candInputData = (CandInputData) ListProtector.get(list3, i)) == null || (list = candInputData.viewItems) == null) {
            return 1;
        }
        return list.size();
    }

    public static final View LLLFZ(int i, ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        CandInputData candInputData;
        AbstractViewOnClickListenerC1745630vWj abstractViewOnClickListenerC1745630vWj = (AbstractViewOnClickListenerC1745630vWj) viewHolder;
        List<CandInputData> list = this.LL;
        if (list != null) {
            candInputData = (CandInputData) ListProtector.get(list, i);
        } else {
            candInputData = null;
        }
        abstractViewOnClickListenerC1745630vWj.I5(candInputData, getItemCount(), this.LLILLJJLI, this.LLILLL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractViewOnClickListenerC1745630vWj abstractViewOnClickListenerC1745630vWj;
        if (i != -2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        final View viewLLLFZ = LLLFZ(R.layout.ai0, viewGroup);
                        abstractViewOnClickListenerC1745630vWj = new AbstractViewOnClickListenerC1745630vWj(viewLLLFZ) { // from class: X.0vWd
                            public final TextView LLILLJJLI = (TextView) this.itemView.findViewById(R.id.zbz);
                            public final TuxIconView LLILLL = (TuxIconView) this.itemView.findViewById(R.id.zby);
                            public final TuxSpinner LLILZ = (TuxSpinner) this.itemView.findViewById(R.id.zbx);

                            @Override // X.AbstractViewOnClickListenerC1745630vWj
                            public final void I5(CandInputData candInputData, int i2, ViewStyle viewStyle, String str) {
                                List<ViewItem> list;
                                Integer num;
                                List<ViewItem> list2;
                                ViewItem viewItem;
                                List<ViewItem> list3;
                                ViewItem viewItem2;
                                String str2;
                                Integer num2;
                                List<ViewItem> list4;
                                ViewItem viewItem3;
                                List<ViewItem> list5;
                                ViewItem viewItem4;
                                String str3;
                                List<ViewItem> list6;
                                ViewItem viewItem5;
                                List<ViewItem> list7;
                                ViewItem viewItem6;
                                List<ViewItem> list8;
                                ViewItem viewItem7;
                                String str4;
                                List<ViewItem> list9;
                                ViewItem viewItem8;
                                String str5 = null;
                                if (candInputData != null && (list = candInputData.viewItems) != null && !list.isEmpty()) {
                                    if (viewStyle != null) {
                                        num = viewStyle.viewItemHighlightMode;
                                    } else {
                                        num = null;
                                    }
                                    String str6 = "";
                                    if (num != null) {
                                        Integer num3 = viewStyle.viewItemHighlightMode;
                                        int iOrdinal = C0N7N.DEFAULTMODE.ordinal();
                                        if (num3 != null && num3.intValue() == iOrdinal) {
                                            TextView textView = this.LLILLJJLI;
                                            if (candInputData != null && (list9 = candInputData.viewItems) != null && (viewItem8 = (ViewItem) C13LP.LJJJLZIJ(0, list9)) != null) {
                                                str5 = viewItem8.text;
                                            }
                                            textView.setText(str5);
                                        } else {
                                            int iOrdinal2 = C0N7N.KEYWORDMODE.ordinal();
                                            if (num3 != null && num3.intValue() == iOrdinal2) {
                                                TextView textView2 = this.LLILLJJLI;
                                                if (candInputData != null && (list8 = candInputData.viewItems) != null && (viewItem7 = (ViewItem) C13LP.LJJJLZIJ(0, list8)) != null && (str4 = viewItem7.text) != null) {
                                                    str6 = str4;
                                                }
                                                CharSequence charSequenceLIZ = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                                if (charSequenceLIZ == null) {
                                                    if (candInputData != null && (list7 = candInputData.viewItems) != null && (viewItem6 = (ViewItem) C13LP.LJJJLZIJ(0, list7)) != null) {
                                                        str5 = viewItem6.text;
                                                    }
                                                    charSequenceLIZ = str5;
                                                }
                                                textView2.setText(charSequenceLIZ);
                                            } else {
                                                int iOrdinal3 = C0N7N.DISABLEMODE.ordinal();
                                                if (num3 != null && num3.intValue() == iOrdinal3) {
                                                    this.LLILLJJLI.setTextColor(R.attr.a1k);
                                                    TextView textView3 = this.LLILLJJLI;
                                                    if (candInputData != null && (list6 = candInputData.viewItems) != null && (viewItem5 = (ViewItem) C13LP.LJJJLZIJ(0, list6)) != null) {
                                                        str5 = viewItem5.text;
                                                    }
                                                    textView3.setText(str5);
                                                } else {
                                                    TextView textView4 = this.LLILLJJLI;
                                                    if (candInputData != null && (list5 = candInputData.viewItems) != null && (viewItem4 = (ViewItem) C13LP.LJJJLZIJ(0, list5)) != null && (str3 = viewItem4.text) != null) {
                                                        str6 = str3;
                                                    }
                                                    CharSequence charSequenceLIZ2 = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                                    if (charSequenceLIZ2 == null) {
                                                        if (candInputData != null && (list4 = candInputData.viewItems) != null && (viewItem3 = (ViewItem) C13LP.LJJJLZIJ(0, list4)) != null) {
                                                            str5 = viewItem3.text;
                                                        }
                                                        charSequenceLIZ2 = str5;
                                                    }
                                                    textView4.setText(charSequenceLIZ2);
                                                }
                                            }
                                        }
                                    } else {
                                        TextView textView5 = this.LLILLJJLI;
                                        if (candInputData != null && (list3 = candInputData.viewItems) != null && (viewItem2 = (ViewItem) C13LP.LJJJLZIJ(0, list3)) != null && (str2 = viewItem2.text) != null) {
                                            str6 = str2;
                                        }
                                        CharSequence charSequenceLIZ3 = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                        if (charSequenceLIZ3 == null) {
                                            if (candInputData != null && (list2 = candInputData.viewItems) != null && (viewItem = (ViewItem) C13LP.LJJJLZIJ(0, list2)) != null) {
                                                str5 = viewItem.text;
                                            }
                                            charSequenceLIZ3 = str5;
                                        }
                                        textView5.setText(charSequenceLIZ3);
                                    }
                                    C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
                                    C786410Ut5.LLZILL(this.LLILZ, 8);
                                    if (candInputData != null && (num2 = candInputData.suggestType) != null && num2.intValue() == 1) {
                                        if (candInputData.LIZIZ == 0) {
                                            C786410Ut5.LLLLLLZZ(this.LLILLL, 0);
                                            C786410Ut5.LLZILL(this.LLILZ, 8);
                                        } else {
                                            C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
                                            C786410Ut5.LLZILL(this.LLILZ, 0);
                                        }
                                    }
                                }
                            }
                        };
                    } else {
                        final View viewLLLFZ2 = LLLFZ(R.layout.ai1, viewGroup);
                        abstractViewOnClickListenerC1745630vWj = new AbstractViewOnClickListenerC1745630vWj(viewLLLFZ2) { // from class: X.0vWd
                            public final TextView LLILLJJLI = (TextView) this.itemView.findViewById(R.id.zbz);
                            public final TuxIconView LLILLL = (TuxIconView) this.itemView.findViewById(R.id.zby);
                            public final TuxSpinner LLILZ = (TuxSpinner) this.itemView.findViewById(R.id.zbx);

                            @Override // X.AbstractViewOnClickListenerC1745630vWj
                            public final void I5(CandInputData candInputData, int i2, ViewStyle viewStyle, String str) {
                                List<ViewItem> list;
                                Integer num;
                                List<ViewItem> list2;
                                ViewItem viewItem;
                                List<ViewItem> list3;
                                ViewItem viewItem2;
                                String str2;
                                Integer num2;
                                List<ViewItem> list4;
                                ViewItem viewItem3;
                                List<ViewItem> list5;
                                ViewItem viewItem4;
                                String str3;
                                List<ViewItem> list6;
                                ViewItem viewItem5;
                                List<ViewItem> list7;
                                ViewItem viewItem6;
                                List<ViewItem> list8;
                                ViewItem viewItem7;
                                String str4;
                                List<ViewItem> list9;
                                ViewItem viewItem8;
                                String str5 = null;
                                if (candInputData != null && (list = candInputData.viewItems) != null && !list.isEmpty()) {
                                    if (viewStyle != null) {
                                        num = viewStyle.viewItemHighlightMode;
                                    } else {
                                        num = null;
                                    }
                                    String str6 = "";
                                    if (num != null) {
                                        Integer num3 = viewStyle.viewItemHighlightMode;
                                        int iOrdinal = C0N7N.DEFAULTMODE.ordinal();
                                        if (num3 != null && num3.intValue() == iOrdinal) {
                                            TextView textView = this.LLILLJJLI;
                                            if (candInputData != null && (list9 = candInputData.viewItems) != null && (viewItem8 = (ViewItem) C13LP.LJJJLZIJ(0, list9)) != null) {
                                                str5 = viewItem8.text;
                                            }
                                            textView.setText(str5);
                                        } else {
                                            int iOrdinal2 = C0N7N.KEYWORDMODE.ordinal();
                                            if (num3 != null && num3.intValue() == iOrdinal2) {
                                                TextView textView2 = this.LLILLJJLI;
                                                if (candInputData != null && (list8 = candInputData.viewItems) != null && (viewItem7 = (ViewItem) C13LP.LJJJLZIJ(0, list8)) != null && (str4 = viewItem7.text) != null) {
                                                    str6 = str4;
                                                }
                                                CharSequence charSequenceLIZ = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                                if (charSequenceLIZ == null) {
                                                    if (candInputData != null && (list7 = candInputData.viewItems) != null && (viewItem6 = (ViewItem) C13LP.LJJJLZIJ(0, list7)) != null) {
                                                        str5 = viewItem6.text;
                                                    }
                                                    charSequenceLIZ = str5;
                                                }
                                                textView2.setText(charSequenceLIZ);
                                            } else {
                                                int iOrdinal3 = C0N7N.DISABLEMODE.ordinal();
                                                if (num3 != null && num3.intValue() == iOrdinal3) {
                                                    this.LLILLJJLI.setTextColor(R.attr.a1k);
                                                    TextView textView3 = this.LLILLJJLI;
                                                    if (candInputData != null && (list6 = candInputData.viewItems) != null && (viewItem5 = (ViewItem) C13LP.LJJJLZIJ(0, list6)) != null) {
                                                        str5 = viewItem5.text;
                                                    }
                                                    textView3.setText(str5);
                                                } else {
                                                    TextView textView4 = this.LLILLJJLI;
                                                    if (candInputData != null && (list5 = candInputData.viewItems) != null && (viewItem4 = (ViewItem) C13LP.LJJJLZIJ(0, list5)) != null && (str3 = viewItem4.text) != null) {
                                                        str6 = str3;
                                                    }
                                                    CharSequence charSequenceLIZ2 = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                                    if (charSequenceLIZ2 == null) {
                                                        if (candInputData != null && (list4 = candInputData.viewItems) != null && (viewItem3 = (ViewItem) C13LP.LJJJLZIJ(0, list4)) != null) {
                                                            str5 = viewItem3.text;
                                                        }
                                                        charSequenceLIZ2 = str5;
                                                    }
                                                    textView4.setText(charSequenceLIZ2);
                                                }
                                            }
                                        }
                                    } else {
                                        TextView textView5 = this.LLILLJJLI;
                                        if (candInputData != null && (list3 = candInputData.viewItems) != null && (viewItem2 = (ViewItem) C13LP.LJJJLZIJ(0, list3)) != null && (str2 = viewItem2.text) != null) {
                                            str6 = str2;
                                        }
                                        CharSequence charSequenceLIZ3 = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                        if (charSequenceLIZ3 == null) {
                                            if (candInputData != null && (list2 = candInputData.viewItems) != null && (viewItem = (ViewItem) C13LP.LJJJLZIJ(0, list2)) != null) {
                                                str5 = viewItem.text;
                                            }
                                            charSequenceLIZ3 = str5;
                                        }
                                        textView5.setText(charSequenceLIZ3);
                                    }
                                    C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
                                    C786410Ut5.LLZILL(this.LLILZ, 8);
                                    if (candInputData != null && (num2 = candInputData.suggestType) != null && num2.intValue() == 1) {
                                        if (candInputData.LIZIZ == 0) {
                                            C786410Ut5.LLLLLLZZ(this.LLILLL, 0);
                                            C786410Ut5.LLZILL(this.LLILZ, 8);
                                        } else {
                                            C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
                                            C786410Ut5.LLZILL(this.LLILZ, 0);
                                        }
                                    }
                                }
                            }
                        };
                    }
                } else {
                    final View viewLLLFZ3 = LLLFZ(R.layout.ai2, viewGroup);
                    abstractViewOnClickListenerC1745630vWj = new AbstractViewOnClickListenerC1745630vWj(viewLLLFZ3) { // from class: X.0vWe
                        public final TextView LLILLJJLI = (TextView) this.itemView.findViewById(R.id.zc0);
                        public final TextView LLILLL = (TextView) this.itemView.findViewById(R.id.zc1);

                        @Override // X.AbstractViewOnClickListenerC1745630vWj
                        public final void I5(CandInputData candInputData, int i2, ViewStyle viewStyle, String str) {
                            int size;
                            Integer num;
                            List<ViewItem> list;
                            ViewItem viewItem;
                            List<ViewItem> list2;
                            ViewItem viewItem2;
                            String str2;
                            List<ViewItem> list3;
                            ViewItem viewItem3;
                            List<ViewItem> list4;
                            ViewItem viewItem4;
                            List<ViewItem> list5;
                            ViewItem viewItem5;
                            String str3;
                            String str4;
                            List<ViewItem> list6;
                            ViewItem viewItem6;
                            List<ViewItem> list7;
                            ViewItem viewItem7;
                            List<ViewItem> list8;
                            ViewItem viewItem8;
                            String str5;
                            String str6;
                            List<ViewItem> list9;
                            ViewItem viewItem9;
                            List<ViewItem> list10;
                            boolean z = false;
                            if (candInputData != null && (list10 = candInputData.viewItems) != null) {
                                size = list10.size();
                            } else {
                                size = 0;
                            }
                            if (size > 1) {
                                String str7 = null;
                                if (viewStyle != null) {
                                    num = viewStyle.viewItemHighlightMode;
                                } else {
                                    num = null;
                                }
                                String str8 = "";
                                if (num != null) {
                                    Integer num2 = viewStyle.viewItemHighlightMode;
                                    int iOrdinal = C0N7N.DEFAULTMODE.ordinal();
                                    if (num2 != null && num2.intValue() == iOrdinal) {
                                        TextView textView = this.LLILLJJLI;
                                        if (candInputData != null && (list9 = candInputData.viewItems) != null && (viewItem9 = (ViewItem) C13LP.LJJJLZIJ(0, list9)) != null) {
                                            str6 = viewItem9.text;
                                        } else {
                                            str6 = null;
                                        }
                                        textView.setText(str6);
                                    } else {
                                        int iOrdinal2 = C0N7N.KEYWORDMODE.ordinal();
                                        if (num2 != null && num2.intValue() == iOrdinal2) {
                                            TextView textView2 = this.LLILLJJLI;
                                            if (candInputData != null && (list8 = candInputData.viewItems) != null && (viewItem8 = (ViewItem) C13LP.LJJJLZIJ(0, list8)) != null && (str5 = viewItem8.text) != null) {
                                                str8 = str5;
                                            }
                                            CharSequence charSequenceLIZ = C240600wO.LIZ(str, null, null, str8, this.itemView.getContext());
                                            if (charSequenceLIZ == null) {
                                                if (candInputData != null && (list7 = candInputData.viewItems) != null && (viewItem7 = (ViewItem) C13LP.LJJJLZIJ(0, list7)) != null) {
                                                    charSequenceLIZ = viewItem7.text;
                                                } else {
                                                    charSequenceLIZ = null;
                                                }
                                            }
                                            textView2.setText(charSequenceLIZ);
                                        } else {
                                            int iOrdinal3 = C0N7N.DISABLEMODE.ordinal();
                                            if (num2 != null && num2.intValue() == iOrdinal3) {
                                                this.LLILLJJLI.setTextColor(R.attr.a1k);
                                                TextView textView3 = this.LLILLJJLI;
                                                if (candInputData != null && (list6 = candInputData.viewItems) != null && (viewItem6 = (ViewItem) C13LP.LJJJLZIJ(0, list6)) != null) {
                                                    str4 = viewItem6.text;
                                                } else {
                                                    str4 = null;
                                                }
                                                textView3.setText(str4);
                                            } else {
                                                TextView textView4 = this.LLILLJJLI;
                                                if (candInputData != null && (list5 = candInputData.viewItems) != null && (viewItem5 = (ViewItem) C13LP.LJJJLZIJ(0, list5)) != null && (str3 = viewItem5.text) != null) {
                                                    str8 = str3;
                                                }
                                                CharSequence charSequenceLIZ2 = C240600wO.LIZ(str, null, null, str8, this.itemView.getContext());
                                                if (charSequenceLIZ2 == null) {
                                                    if (candInputData != null && (list4 = candInputData.viewItems) != null && (viewItem4 = (ViewItem) C13LP.LJJJLZIJ(0, list4)) != null) {
                                                        charSequenceLIZ2 = viewItem4.text;
                                                    } else {
                                                        charSequenceLIZ2 = null;
                                                    }
                                                }
                                                textView4.setText(charSequenceLIZ2);
                                            }
                                        }
                                    }
                                } else {
                                    TextView textView5 = this.LLILLJJLI;
                                    if (candInputData != null && (list2 = candInputData.viewItems) != null && (viewItem2 = (ViewItem) C13LP.LJJJLZIJ(0, list2)) != null && (str2 = viewItem2.text) != null) {
                                        str8 = str2;
                                    }
                                    CharSequence charSequenceLIZ3 = C240600wO.LIZ(str, null, null, str8, this.itemView.getContext());
                                    if (charSequenceLIZ3 == null) {
                                        if (candInputData != null && (list = candInputData.viewItems) != null && (viewItem = (ViewItem) C13LP.LJJJLZIJ(0, list)) != null) {
                                            charSequenceLIZ3 = viewItem.text;
                                        } else {
                                            charSequenceLIZ3 = null;
                                        }
                                    }
                                    textView5.setText(charSequenceLIZ3);
                                }
                                TextView textView6 = this.LLILLL;
                                if (candInputData != null && (list3 = candInputData.viewItems) != null && (viewItem3 = (ViewItem) C13LP.LJJJLZIJ(1, list3)) != null) {
                                    str7 = viewItem3.text;
                                }
                                textView6.setText(str7);
                            }
                            View view = this.itemView;
                            if (getLayoutPosition() != i2 - 1) {
                                z = true;
                            }
                            C03J8.LIZ(view, z);
                        }
                    };
                }
            } else {
                final View viewLLLFZ4 = LLLFZ(R.layout.ai0, viewGroup);
                abstractViewOnClickListenerC1745630vWj = new AbstractViewOnClickListenerC1745630vWj(viewLLLFZ4) { // from class: X.0vWd
                    public final TextView LLILLJJLI = (TextView) this.itemView.findViewById(R.id.zbz);
                    public final TuxIconView LLILLL = (TuxIconView) this.itemView.findViewById(R.id.zby);
                    public final TuxSpinner LLILZ = (TuxSpinner) this.itemView.findViewById(R.id.zbx);

                    @Override // X.AbstractViewOnClickListenerC1745630vWj
                    public final void I5(CandInputData candInputData, int i2, ViewStyle viewStyle, String str) {
                        List<ViewItem> list;
                        Integer num;
                        List<ViewItem> list2;
                        ViewItem viewItem;
                        List<ViewItem> list3;
                        ViewItem viewItem2;
                        String str2;
                        Integer num2;
                        List<ViewItem> list4;
                        ViewItem viewItem3;
                        List<ViewItem> list5;
                        ViewItem viewItem4;
                        String str3;
                        List<ViewItem> list6;
                        ViewItem viewItem5;
                        List<ViewItem> list7;
                        ViewItem viewItem6;
                        List<ViewItem> list8;
                        ViewItem viewItem7;
                        String str4;
                        List<ViewItem> list9;
                        ViewItem viewItem8;
                        String str5 = null;
                        if (candInputData != null && (list = candInputData.viewItems) != null && !list.isEmpty()) {
                            if (viewStyle != null) {
                                num = viewStyle.viewItemHighlightMode;
                            } else {
                                num = null;
                            }
                            String str6 = "";
                            if (num != null) {
                                Integer num3 = viewStyle.viewItemHighlightMode;
                                int iOrdinal = C0N7N.DEFAULTMODE.ordinal();
                                if (num3 != null && num3.intValue() == iOrdinal) {
                                    TextView textView = this.LLILLJJLI;
                                    if (candInputData != null && (list9 = candInputData.viewItems) != null && (viewItem8 = (ViewItem) C13LP.LJJJLZIJ(0, list9)) != null) {
                                        str5 = viewItem8.text;
                                    }
                                    textView.setText(str5);
                                } else {
                                    int iOrdinal2 = C0N7N.KEYWORDMODE.ordinal();
                                    if (num3 != null && num3.intValue() == iOrdinal2) {
                                        TextView textView2 = this.LLILLJJLI;
                                        if (candInputData != null && (list8 = candInputData.viewItems) != null && (viewItem7 = (ViewItem) C13LP.LJJJLZIJ(0, list8)) != null && (str4 = viewItem7.text) != null) {
                                            str6 = str4;
                                        }
                                        CharSequence charSequenceLIZ = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                        if (charSequenceLIZ == null) {
                                            if (candInputData != null && (list7 = candInputData.viewItems) != null && (viewItem6 = (ViewItem) C13LP.LJJJLZIJ(0, list7)) != null) {
                                                str5 = viewItem6.text;
                                            }
                                            charSequenceLIZ = str5;
                                        }
                                        textView2.setText(charSequenceLIZ);
                                    } else {
                                        int iOrdinal3 = C0N7N.DISABLEMODE.ordinal();
                                        if (num3 != null && num3.intValue() == iOrdinal3) {
                                            this.LLILLJJLI.setTextColor(R.attr.a1k);
                                            TextView textView3 = this.LLILLJJLI;
                                            if (candInputData != null && (list6 = candInputData.viewItems) != null && (viewItem5 = (ViewItem) C13LP.LJJJLZIJ(0, list6)) != null) {
                                                str5 = viewItem5.text;
                                            }
                                            textView3.setText(str5);
                                        } else {
                                            TextView textView4 = this.LLILLJJLI;
                                            if (candInputData != null && (list5 = candInputData.viewItems) != null && (viewItem4 = (ViewItem) C13LP.LJJJLZIJ(0, list5)) != null && (str3 = viewItem4.text) != null) {
                                                str6 = str3;
                                            }
                                            CharSequence charSequenceLIZ2 = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                            if (charSequenceLIZ2 == null) {
                                                if (candInputData != null && (list4 = candInputData.viewItems) != null && (viewItem3 = (ViewItem) C13LP.LJJJLZIJ(0, list4)) != null) {
                                                    str5 = viewItem3.text;
                                                }
                                                charSequenceLIZ2 = str5;
                                            }
                                            textView4.setText(charSequenceLIZ2);
                                        }
                                    }
                                }
                            } else {
                                TextView textView5 = this.LLILLJJLI;
                                if (candInputData != null && (list3 = candInputData.viewItems) != null && (viewItem2 = (ViewItem) C13LP.LJJJLZIJ(0, list3)) != null && (str2 = viewItem2.text) != null) {
                                    str6 = str2;
                                }
                                CharSequence charSequenceLIZ3 = C240600wO.LIZ(str, null, null, str6, this.itemView.getContext());
                                if (charSequenceLIZ3 == null) {
                                    if (candInputData != null && (list2 = candInputData.viewItems) != null && (viewItem = (ViewItem) C13LP.LJJJLZIJ(0, list2)) != null) {
                                        str5 = viewItem.text;
                                    }
                                    charSequenceLIZ3 = str5;
                                }
                                textView5.setText(charSequenceLIZ3);
                            }
                            C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
                            C786410Ut5.LLZILL(this.LLILZ, 8);
                            if (candInputData != null && (num2 = candInputData.suggestType) != null && num2.intValue() == 1) {
                                if (candInputData.LIZIZ == 0) {
                                    C786410Ut5.LLLLLLZZ(this.LLILLL, 0);
                                    C786410Ut5.LLZILL(this.LLILZ, 8);
                                } else {
                                    C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
                                    C786410Ut5.LLZILL(this.LLILZ, 0);
                                }
                            }
                        }
                    }
                };
            }
        } else {
            final View viewLLLFZ5 = LLLFZ(R.layout.ahz, viewGroup);
            abstractViewOnClickListenerC1745630vWj = new AbstractViewOnClickListenerC1745630vWj(viewLLLFZ5) { // from class: X.0vWi
                public final TextView LLILLJJLI = (TextView) this.itemView.findViewById(R.id.zbw);

                @Override // X.AbstractViewOnClickListenerC1745630vWj
                public final void I5(CandInputData candInputData, int i2, ViewStyle viewStyle, String str) {
                    List<ViewItem> list;
                    List<ViewItem> list2;
                    ViewItem viewItem;
                    String str2 = null;
                    if (this.LL != null) {
                        this.LL = null;
                    }
                    if (candInputData != null && (list = candInputData.viewItems) != null && !list.isEmpty()) {
                        TextView textView = this.LLILLJJLI;
                        if (candInputData != null && (list2 = candInputData.viewItems) != null && (viewItem = (ViewItem) ListProtector.get(list2, 0)) != null) {
                            str2 = viewItem.text;
                        }
                        textView.setText(str2);
                    }
                }
            };
        }
        abstractViewOnClickListenerC1745630vWj.LL = this.LLILZIL;
        try {
            View view = abstractViewOnClickListenerC1745630vWj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        abstractViewOnClickListenerC1745630vWj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (abstractViewOnClickListenerC1745630vWj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(abstractViewOnClickListenerC1745630vWj.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) abstractViewOnClickListenerC1745630vWj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(abstractViewOnClickListenerC1745630vWj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = abstractViewOnClickListenerC1745630vWj.getClass().getName();
        return abstractViewOnClickListenerC1745630vWj;
    }
}
