package X;

import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.DisplayCondition;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.EachConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodHeaderConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodPageConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodShowConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSingleChoiceData;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestion;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.RatingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.00bq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C113200bq {
    public static final FeelgoodSurveyQuestion LIZ(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        List<FeelgoodPageConfig> list;
        FeelgoodPageConfig feelgoodPageConfig;
        List<FeelgoodSurveyQuestion> list2;
        FeelgoodShowConfig feelgoodShowConfig = feelgoodSurveyQuestionnaire.showConfig;
        if (feelgoodShowConfig != null && (list = feelgoodShowConfig.pageConfig) != null && (feelgoodPageConfig = (FeelgoodPageConfig) C13LP.LJJJLZIJ(0, list)) != null && (list2 = feelgoodPageConfig.questionList) != null) {
            for (FeelgoodSurveyQuestion feelgoodSurveyQuestion : list2) {
                Integer num = feelgoodSurveyQuestion.questionType;
                int type = EnumC113300br.SINGLE_CHOICE.getType();
                if (num != null && num.intValue() == type) {
                    return feelgoodSurveyQuestion;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return null;
    }

    public static final List<FeelgoodOptionData> LIZIZ(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        List<FeelgoodPageConfig> list;
        FeelgoodPageConfig feelgoodPageConfig;
        List<FeelgoodSurveyQuestion> list2;
        FeelgoodSurveyQuestion feelgoodSurveyQuestionPrevious;
        RatingData ratingData;
        FeelgoodShowConfig feelgoodShowConfig = feelgoodSurveyQuestionnaire.showConfig;
        if (feelgoodShowConfig == null || (list = feelgoodShowConfig.pageConfig) == null || (feelgoodPageConfig = (FeelgoodPageConfig) C13LP.LJJJLZIJ(0, list)) == null || (list2 = feelgoodPageConfig.questionList) == null) {
            return null;
        }
        ListIterator<FeelgoodSurveyQuestion> listIterator = list2.listIterator(list2.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                feelgoodSurveyQuestionPrevious = listIterator.previous();
                Integer num = feelgoodSurveyQuestionPrevious.questionType;
                int type = EnumC113300br.RATING_CHOICE.getType();
                if (num != null && num.intValue() == type) {
                    break;
                }
            } else {
                feelgoodSurveyQuestionPrevious = null;
                break;
            }
        }
        FeelgoodSurveyQuestion feelgoodSurveyQuestion = feelgoodSurveyQuestionPrevious;
        if (feelgoodSurveyQuestion == null || (ratingData = feelgoodSurveyQuestion.ratingData) == null) {
            return null;
        }
        return ratingData.optionList;
    }

    public static final FeelgoodSurveyQuestion LIZJ(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        List<FeelgoodPageConfig> list;
        FeelgoodPageConfig feelgoodPageConfig;
        List<FeelgoodSurveyQuestion> list2;
        FeelgoodShowConfig feelgoodShowConfig = feelgoodSurveyQuestionnaire.showConfig;
        FeelgoodSurveyQuestion feelgoodSurveyQuestion = null;
        if (feelgoodShowConfig == null || (list = feelgoodShowConfig.pageConfig) == null || (feelgoodPageConfig = (FeelgoodPageConfig) C13LP.LJJJLZIJ(0, list)) == null || (list2 = feelgoodPageConfig.questionList) == null) {
            return null;
        }
        ListIterator<FeelgoodSurveyQuestion> listIterator = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            FeelgoodSurveyQuestion feelgoodSurveyQuestionPrevious = listIterator.previous();
            Integer num = feelgoodSurveyQuestionPrevious.questionType;
            int type = EnumC113300br.RATING_CHOICE.getType();
            if (num != null && num.intValue() == type) {
                feelgoodSurveyQuestion = feelgoodSurveyQuestionPrevious;
                break;
            }
        }
        return feelgoodSurveyQuestion;
    }

    public static final List<FeelgoodOptionData> LJI(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        FeelgoodSingleChoiceData feelgoodSingleChoiceData;
        FeelgoodSurveyQuestion feelgoodSurveyQuestionLIZ = LIZ(feelgoodSurveyQuestionnaire);
        if (feelgoodSurveyQuestionLIZ != null && (feelgoodSingleChoiceData = feelgoodSurveyQuestionLIZ.singleChoiceData) != null) {
            return feelgoodSingleChoiceData.optionList;
        }
        return null;
    }

    public static final String LJII(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        List<FeelgoodPageConfig> list;
        FeelgoodPageConfig feelgoodPageConfig;
        FeelgoodHeaderConfig feelgoodHeaderConfig;
        String str;
        FeelgoodShowConfig feelgoodShowConfig = feelgoodSurveyQuestionnaire.showConfig;
        if (feelgoodShowConfig == null || (list = feelgoodShowConfig.pageConfig) == null || (feelgoodPageConfig = (FeelgoodPageConfig) C13LP.LJJJLZIJ(0, list)) == null || (feelgoodHeaderConfig = feelgoodPageConfig.headerConfig) == null || (str = feelgoodHeaderConfig.title) == null) {
            return "";
        }
        return str;
    }

    public static final List<FeelgoodOptionData> LIZLLL(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire, String str) {
        FeelgoodSingleChoiceData feelgoodSingleChoiceData;
        FeelgoodSurveyQuestion feelgoodSurveyQuestionLJFF = LJFF(feelgoodSurveyQuestionnaire, str);
        if (feelgoodSurveyQuestionLJFF == null || (feelgoodSingleChoiceData = feelgoodSurveyQuestionLJFF.singleChoiceData) == null) {
            return null;
        }
        return feelgoodSingleChoiceData.optionList;
    }

    public static final FeelgoodSurveyQuestion LJ(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire, String str) {
        List<FeelgoodPageConfig> list;
        FeelgoodPageConfig feelgoodPageConfig;
        List<FeelgoodSurveyQuestion> list2;
        List<EachConfig> list3;
        EachConfig eachConfig;
        List<String> list4;
        FeelgoodShowConfig feelgoodShowConfig = feelgoodSurveyQuestionnaire.showConfig;
        FeelgoodSurveyQuestion feelgoodSurveyQuestion = null;
        if (feelgoodShowConfig == null || (list = feelgoodShowConfig.pageConfig) == null || (feelgoodPageConfig = (FeelgoodPageConfig) C13LP.LJJJLZIJ(0, list)) == null || (list2 = feelgoodPageConfig.questionList) == null) {
            return null;
        }
        Iterator<FeelgoodSurveyQuestion> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            FeelgoodSurveyQuestion next = it2.next();
            DisplayCondition displayCondition = next.displayCondition;
            if (displayCondition != null && (list3 = displayCondition.eachConfig) != null && (eachConfig = (EachConfig) C13LP.LJJJLZIJ(0, list3)) != null && (list4 = eachConfig.optionKeyList) != null && C13LP.LJJJJ(str, list4)) {
                feelgoodSurveyQuestion = next;
                break;
            }
        }
        return feelgoodSurveyQuestion;
    }

    public static final FeelgoodSurveyQuestion LJFF(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire, String str) {
        List<FeelgoodPageConfig> list;
        FeelgoodPageConfig feelgoodPageConfig;
        List<FeelgoodSurveyQuestion> list2;
        List<EachConfig> list3;
        EachConfig eachConfig;
        List<String> list4;
        FeelgoodShowConfig feelgoodShowConfig = feelgoodSurveyQuestionnaire.showConfig;
        Object obj = null;
        if (feelgoodShowConfig == null || (list = feelgoodShowConfig.pageConfig) == null || (feelgoodPageConfig = (FeelgoodPageConfig) C13LP.LJJJLZIJ(0, list)) == null || (list2 = feelgoodPageConfig.questionList) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeelgoodSurveyQuestion feelgoodSurveyQuestion : list2) {
            DisplayCondition displayCondition = feelgoodSurveyQuestion.displayCondition;
            if (displayCondition != null && (list3 = displayCondition.eachConfig) != null && (eachConfig = (EachConfig) C13LP.LJJJLZIJ(0, list3)) != null && (list4 = eachConfig.optionKeyList) != null && C13LP.LJJJJ(str, list4)) {
                arrayList.add(feelgoodSurveyQuestion);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            Integer num = ((FeelgoodSurveyQuestion) objPrevious).questionType;
            int type = EnumC113300br.SINGLE_CHOICE.getType();
            if (num != null && num.intValue() == type) {
                obj = objPrevious;
                break;
            }
        }
        return (FeelgoodSurveyQuestion) obj;
    }
}
