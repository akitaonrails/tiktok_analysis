package X;

import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarContainer;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIconStyle;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarMargin;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarPadding;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarTextStyle;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.02tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C733302tf {
    public static final void LIZJ(CommentTopBarComponent commentTopBarComponent) {
        CommentTopBarComponent commentTopBarComponent2;
        CommentTopBarTextStyle commentTopBarTextStyle;
        CommentTopBarMargin commentTopBarMargin;
        CommentTopBarPadding commentTopBarPadding;
        CommentTopBarPadding commentTopBarPadding2;
        CommentTopBarMargin commentTopBarMargin2;
        CommentTopBarTextStyle commentTopBarTextStyle2;
        CommentTopBarIconStyle commentTopBarIconStyle;
        CommentTopBarMargin commentTopBarMargin3;
        CommentTopBarMargin commentTopBarMargin4;
        CommentTopBarIconStyle commentTopBarIconStyle2;
        Integer num = commentTopBarComponent.templateType;
        int value = EnumC804003Cc.ANCHOR_TEMPLATE.getValue();
        if (num != null && num.intValue() == value) {
            commentTopBarComponent2 = C733402tg.LIZ;
        } else {
            int value2 = EnumC804003Cc.SEARCH_TEMPLATE.getValue();
            if (num != null && num.intValue() == value2) {
                commentTopBarComponent2 = C733502th.LIZ;
            } else {
                int value3 = EnumC804003Cc.ACTIVITY_TEMPLATE.getValue();
                if (num != null && num.intValue() == value3) {
                    commentTopBarComponent2 = C733602ti.LIZ;
                } else {
                    commentTopBarComponent2 = C733402tg.LIZ;
                }
            }
        }
        CommentTopBarContainer commentTopBarContainer = commentTopBarComponent.container;
        if (commentTopBarContainer == null) {
            commentTopBarComponent.setContainer(commentTopBarComponent2.container);
        } else {
            CommentTopBarContainer commentTopBarContainer2 = commentTopBarComponent2.container;
            if (commentTopBarContainer2 != null) {
                Integer num2 = commentTopBarContainer.height;
                if (num2 == null || num2.intValue() <= 0) {
                    commentTopBarContainer.setHeight(commentTopBarContainer2.height);
                }
                CommentTopBarPadding commentTopBarPadding3 = commentTopBarContainer.padding;
                if (commentTopBarPadding3 == null) {
                    commentTopBarContainer.setPadding(commentTopBarContainer2.padding);
                } else {
                    LIZIZ(commentTopBarPadding3, commentTopBarContainer2.padding);
                }
                CommentTopBarMargin commentTopBarMargin5 = commentTopBarContainer.margin;
                if (commentTopBarMargin5 == null) {
                    commentTopBarContainer.setMargin(commentTopBarContainer2.margin);
                } else {
                    LIZ(commentTopBarMargin5, commentTopBarContainer2.margin);
                }
            }
        }
        Iterator it2 = C1697810uHb.LJIIJJI(new Pair(commentTopBarComponent.icon, commentTopBarComponent2.icon), new Pair(commentTopBarComponent.tailIcon, commentTopBarComponent2.tailIcon)).iterator();
        while (true) {
            CommentTopBarPadding commentTopBarPadding4 = null;
            if (!it2.hasNext()) {
                break;
            }
            Pair pair = (Pair) it2.next();
            CommentTopBarIcon commentTopBarIcon = (CommentTopBarIcon) pair.getFirst();
            if (commentTopBarIcon != null) {
                CommentTopBarIconStyle commentTopBarIconStyle3 = commentTopBarIcon.style;
                if (commentTopBarIconStyle3 == null) {
                    CommentTopBarIcon commentTopBarIcon2 = (CommentTopBarIcon) pair.getSecond();
                    if (commentTopBarIcon2 != null) {
                        commentTopBarIconStyle2 = commentTopBarIcon2.style;
                    } else {
                        commentTopBarIconStyle2 = null;
                    }
                    commentTopBarIcon.setStyle(commentTopBarIconStyle2);
                } else {
                    CommentTopBarIcon commentTopBarIcon3 = (CommentTopBarIcon) pair.getSecond();
                    if (commentTopBarIcon3 != null && (commentTopBarIconStyle = commentTopBarIcon3.style) != null) {
                        Integer num3 = commentTopBarIconStyle3.size;
                        if (num3 == null || num3.intValue() < 0) {
                            commentTopBarIconStyle3.setSize(commentTopBarIconStyle.size);
                        }
                        Integer num4 = commentTopBarIconStyle3.radius;
                        if (num4 == null || num4.intValue() < 0) {
                            commentTopBarIconStyle3.setRadius(commentTopBarIconStyle.radius);
                        }
                    }
                }
                CommentTopBarMargin commentTopBarMargin6 = commentTopBarIcon.margin;
                if (commentTopBarMargin6 == null) {
                    CommentTopBarIcon commentTopBarIcon4 = (CommentTopBarIcon) pair.getSecond();
                    if (commentTopBarIcon4 != null) {
                        commentTopBarMargin4 = commentTopBarIcon4.margin;
                    } else {
                        commentTopBarMargin4 = null;
                    }
                    commentTopBarIcon.setMargin(commentTopBarMargin4);
                } else {
                    CommentTopBarIcon commentTopBarIcon5 = (CommentTopBarIcon) pair.getSecond();
                    if (commentTopBarIcon5 != null) {
                        commentTopBarMargin3 = commentTopBarIcon5.margin;
                    } else {
                        commentTopBarMargin3 = null;
                    }
                    LIZ(commentTopBarMargin6, commentTopBarMargin3);
                }
                CommentTopBarPadding commentTopBarPadding5 = commentTopBarIcon.padding;
                if (commentTopBarPadding5 == null) {
                    CommentTopBarIcon commentTopBarIcon6 = (CommentTopBarIcon) pair.getSecond();
                    if (commentTopBarIcon6 != null) {
                        commentTopBarPadding4 = commentTopBarIcon6.padding;
                    }
                    commentTopBarIcon.setPadding(commentTopBarPadding4);
                } else {
                    CommentTopBarIcon commentTopBarIcon7 = (CommentTopBarIcon) pair.getSecond();
                    if (commentTopBarIcon7 != null) {
                        commentTopBarPadding4 = commentTopBarIcon7.padding;
                    }
                    LIZIZ(commentTopBarPadding5, commentTopBarPadding4);
                }
            }
        }
        for (Pair pair2 : C1697810uHb.LJIIJJI(new Pair(commentTopBarComponent.title, commentTopBarComponent2.title), new Pair(commentTopBarComponent.separator, commentTopBarComponent2.separator), new Pair(commentTopBarComponent.descSuffix, commentTopBarComponent2.descSuffix), new Pair(commentTopBarComponent.descPrefix, commentTopBarComponent2.descPrefix), new Pair(commentTopBarComponent.descTail, commentTopBarComponent2.descTail))) {
            CommentTopBarText commentTopBarText = (CommentTopBarText) pair2.getFirst();
            if (commentTopBarText != null) {
                CommentTopBarTextStyle commentTopBarTextStyle3 = commentTopBarText.textStyle;
                if (commentTopBarTextStyle3 == null) {
                    CommentTopBarText commentTopBarText2 = (CommentTopBarText) pair2.getSecond();
                    if (commentTopBarText2 != null) {
                        commentTopBarTextStyle2 = commentTopBarText2.textStyle;
                    } else {
                        commentTopBarTextStyle2 = null;
                    }
                    commentTopBarText.setTextStyle(commentTopBarTextStyle2);
                } else {
                    CommentTopBarText commentTopBarText3 = (CommentTopBarText) pair2.getSecond();
                    if (commentTopBarText3 != null && (commentTopBarTextStyle = commentTopBarText3.textStyle) != null) {
                        Integer num5 = commentTopBarTextStyle3.fontSize;
                        if (num5 == null || num5.intValue() <= 0) {
                            commentTopBarTextStyle3.setFontSize(commentTopBarTextStyle.fontSize);
                        }
                        Integer num6 = commentTopBarTextStyle3.maxRow;
                        if (num6 == null || num6.intValue() <= 0) {
                            commentTopBarTextStyle3.setMaxRow(commentTopBarTextStyle.maxRow);
                        }
                        Integer num7 = commentTopBarTextStyle3.maxWidth;
                        if (num7 == null || num7.intValue() <= 0) {
                            commentTopBarTextStyle3.setMaxWidth(commentTopBarTextStyle.maxWidth);
                        }
                        Integer num8 = commentTopBarTextStyle3.bold;
                        if (num8 == null || !new IntRange(0, 1).LJLJL(num8.intValue()) || num8.intValue() < 0) {
                            commentTopBarTextStyle3.setBold(commentTopBarTextStyle.bold);
                        }
                        Integer num9 = commentTopBarTextStyle3.ellipsis;
                        if (num9 == null || !new IntRange(1, 2).LJLJL(num9.intValue()) || num9.intValue() < 0) {
                            commentTopBarTextStyle3.setEllipsis(commentTopBarTextStyle.ellipsis);
                        }
                        String str = commentTopBarTextStyle3.fontColor;
                        if (str == null || str.length() == 0 || str.length() == 0) {
                            commentTopBarTextStyle3.setFontColor(commentTopBarTextStyle.fontColor);
                        }
                        String str2 = commentTopBarTextStyle3.tuxFont;
                        if (str2 == null || str2.length() == 0 || C1EE7.LIZ(str2) <= 0 || str2 == null || str2.length() == 0) {
                            commentTopBarTextStyle3.setTuxFont(commentTopBarTextStyle.tuxFont);
                        }
                    }
                }
                CommentTopBarMargin commentTopBarMargin7 = commentTopBarText.margin;
                if (commentTopBarMargin7 == null) {
                    CommentTopBarText commentTopBarText4 = (CommentTopBarText) pair2.getSecond();
                    if (commentTopBarText4 != null) {
                        commentTopBarMargin2 = commentTopBarText4.margin;
                    } else {
                        commentTopBarMargin2 = null;
                    }
                    commentTopBarText.setMargin(commentTopBarMargin2);
                } else {
                    CommentTopBarText commentTopBarText5 = (CommentTopBarText) pair2.getSecond();
                    if (commentTopBarText5 != null) {
                        commentTopBarMargin = commentTopBarText5.margin;
                    } else {
                        commentTopBarMargin = null;
                    }
                    LIZ(commentTopBarMargin7, commentTopBarMargin);
                }
                CommentTopBarPadding commentTopBarPadding6 = commentTopBarText.padding;
                if (commentTopBarPadding6 == null) {
                    CommentTopBarText commentTopBarText6 = (CommentTopBarText) pair2.getSecond();
                    if (commentTopBarText6 != null) {
                        commentTopBarPadding = commentTopBarText6.padding;
                    } else {
                        commentTopBarPadding = null;
                    }
                    commentTopBarText.setPadding(commentTopBarPadding);
                } else {
                    CommentTopBarText commentTopBarText7 = (CommentTopBarText) pair2.getSecond();
                    if (commentTopBarText7 != null) {
                        commentTopBarPadding2 = commentTopBarText7.padding;
                    } else {
                        commentTopBarPadding2 = null;
                    }
                    LIZIZ(commentTopBarPadding6, commentTopBarPadding2);
                }
            }
        }
    }

    public static final void LIZ(CommentTopBarMargin commentTopBarMargin, CommentTopBarMargin commentTopBarMargin2) {
        if (commentTopBarMargin2 == null) {
            return;
        }
        Integer num = commentTopBarMargin.left;
        if (num == null || num.intValue() < 0) {
            commentTopBarMargin.setLeft(commentTopBarMargin2.left);
        }
        Integer num2 = commentTopBarMargin.right;
        if (num2 == null || num2.intValue() < 0) {
            commentTopBarMargin.setRight(commentTopBarMargin2.right);
        }
        Integer num3 = commentTopBarMargin.top;
        if (num3 == null || num3.intValue() < 0) {
            commentTopBarMargin.setTop(commentTopBarMargin2.top);
        }
        Integer num4 = commentTopBarMargin.bottom;
        if (num4 == null || num4.intValue() < 0) {
            commentTopBarMargin.setBottom(commentTopBarMargin2.bottom);
        }
    }

    public static final void LIZIZ(CommentTopBarPadding commentTopBarPadding, CommentTopBarPadding commentTopBarPadding2) {
        if (commentTopBarPadding2 == null) {
            return;
        }
        Integer num = commentTopBarPadding.left;
        if (num == null || num.intValue() < 0) {
            commentTopBarPadding.setLeft(commentTopBarPadding2.left);
        }
        Integer num2 = commentTopBarPadding.right;
        if (num2 == null || num2.intValue() < 0) {
            commentTopBarPadding.setRight(commentTopBarPadding2.right);
        }
        Integer num3 = commentTopBarPadding.top;
        if (num3 == null || num3.intValue() < 0) {
            commentTopBarPadding.setTop(commentTopBarPadding2.top);
        }
        Integer num4 = commentTopBarPadding.bottom;
        if (num4 == null || num4.intValue() < 0) {
            commentTopBarPadding.setBottom(commentTopBarPadding2.bottom);
        }
    }
}
